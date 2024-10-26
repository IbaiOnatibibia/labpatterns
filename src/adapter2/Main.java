package adapter2;

import domain.Covid19Pacient;
import observer.PacientObserverGUI;
import observer.PacientSymptomGUI;

import java.util.Observable;

public class Main {

	public static void main(String[] args) {
		
		/*
		Covid19Pacient pacient=new Covid19Pacient("Pepe", 33);	
		pacient.addSymptomByName("mareos", 2);
		pacient.addSymptomByName("cefalea", 2);
		pacient.addSymptomByName("astenia", 2);
		
		ShowPacientTableGUI gui=new ShowPacientTableGUI(pacient);
		gui.setVisible(true);
		
		Covid19Pacient pacient2=new Covid19Pacient("Kilker", 73);	
		pacient2.addSymptomByName("disnea", 1);
		pacient2.addSymptomByName("cefalea", 1);
		pacient2.addSymptomByName("astenia", 3);
		
		ShowPacientTableGUI gui2=new ShowPacientTableGUI(pacient2);
		gui2.setVisible(true);
		*/
		
		
		Observable pacient=new Covid19Pacient("aitor", 35);
		
		((Covid19Pacient)pacient).addSymptomByName("disnea", 2);
		((Covid19Pacient)pacient).addSymptomByName("cefalea", 2);
		((Covid19Pacient)pacient).addSymptomByName("astenia", 2);
		
		ShowPacientTableGUI gui=new ShowPacientTableGUI(pacient);
		
		new PacientSymptomGUI((Covid19Pacient) pacient);
		
		gui.setVisible(true);

	}

}
