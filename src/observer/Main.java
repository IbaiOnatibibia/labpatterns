package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import factory.SymptomFactory;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		Observable pacient = new Covid19Pacient("aitor", 35);
		Observable pacient2 = new Covid19Pacient("Iker", 70);
		Observable pacient3 = new Covid19Pacient("Pepe", 33);
		
		new PacientSymptomGUI((Covid19Pacient) pacient);
		new PacientThermometerGUI(pacient);
		new SemaphorGUI(pacient);
		
		new PacientSymptomGUI((Covid19Pacient) pacient2);
		new PacientThermometerGUI(pacient2);
		new SemaphorGUI(pacient2);
		
		new PacientSymptomGUI((Covid19Pacient) pacient3);
		new PacientThermometerGUI(pacient3);
		new SemaphorGUI(pacient3);

	}

}
