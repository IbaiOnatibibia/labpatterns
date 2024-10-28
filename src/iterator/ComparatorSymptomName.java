package iterator;

import java.util.Comparator;
import java.util.Objects;

import domain.Symptom;

public class ComparatorSymptomName implements Comparator<Symptom>{
	Symptom s;
	
	@Override
    public int compare(Symptom s1, Symptom s2){
        return s1.getName().compareTo(s2.getName());
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
		return this.s.getName().equals(other.getName());
	}
	
	
}
