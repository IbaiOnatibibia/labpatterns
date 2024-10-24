package adapter2;

import domain.Covid19Pacient;
import observer.PacientObserverGUI;
import observer.PacientSymptomGUI;

import java.util.Observable;

public class Main {

	public static void main(String[] args) {
		Observable pacient=new Covid19Pacient("aitor", 35);
		Covid19Pacient pacient2=new Covid19Pacient("Kilker", 73);
		
		((Covid19Pacient)pacient).addSymptomByName("disnea", 2);
		((Covid19Pacient)pacient).addSymptomByName("cefalea", 1);
		((Covid19Pacient)pacient).addSymptomByName("astenia", 3);
		

		
		pacient2.addSymptomByName("disnea", 2);
		pacient2.addSymptomByName("cefalea", 1);
		pacient2.addSymptomByName("astenia", 3);
		
		ShowPacientTableGUI gui=new ShowPacientTableGUI((Covid19Pacient) pacient);
		ShowPacientTableGUI gui2=new ShowPacientTableGUI(pacient2);
		
		new PacientObserverGUI(pacient);
		new PacientSymptomGUI((Covid19Pacient) pacient);
		
		gui.setPreferredSize(
			      new java.awt.Dimension(300, 200));
		gui.setVisible(true);
		gui2.setVisible(true);


	}

}
