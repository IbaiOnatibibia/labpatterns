package iterator;

import java.util.Comparator;

import domain.Symptom;

public class ComparatorSeverityIndex implements Comparator<Symptom> {
	
	Symptom s;
	
	@Override
    public int compare(Symptom s1, Symptom s2){
        return s1.getSeverityIndex() -  s2.getSeverityIndex();
    }
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Symptom other = (Symptom) obj;
		return this.s.getSeverityIndex() == other.getSeverityIndex();
	}
}
