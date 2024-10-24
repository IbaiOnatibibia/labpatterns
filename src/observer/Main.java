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
		new PacientObserverGUI(pacient);
		new PacientSymptomGUI((Covid19Pacient) pacient);
		new PacientThermometerGUI(pacient);
		new SemaphorGUI(pacient);
	}

}
