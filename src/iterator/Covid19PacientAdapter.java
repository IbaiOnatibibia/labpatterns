package iterator;

import java.util.List;

import adapter.InvertedIterator;
import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientAdapter implements InvertedIterator{
	Covid19Pacient pacient; 
	List<Symptom> symptoms = (List<Symptom>) pacient.getSymptoms();
	int posizioa = symptoms.size() - 1;

	public Covid19PacientAdapter(Covid19Pacient pacient) {
		this.pacient = pacient;
		this.symptoms = s;
	}
	
	public Object previous() {
		
	}

	public boolean hasPrevious() {
	}

	public void goLast() {
		
	}

}
