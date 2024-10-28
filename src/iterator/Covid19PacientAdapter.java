package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import adapter.InvertedIterator;
import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientAdapter implements InvertedIterator{
	Covid19Pacient pacient; 
	List<Symptom> symptoms;
	int posizioa;

	public Covid19PacientAdapter(Covid19Pacient pacient) {
		this.pacient = pacient;
		this.symptoms = new ArrayList<Symptom>(pacient.getSymptoms());
		this.posizioa = symptoms.size() - 1;
	}
	
	public Object previous() {
		Symptom emaitza = symptoms.get(posizioa);
		posizioa--;
		return emaitza;		
	}

	public boolean hasPrevious() {
		return posizioa >= 0;
	}

	public void goLast() {
		posizioa = symptoms.size() - 1;
	}
}
