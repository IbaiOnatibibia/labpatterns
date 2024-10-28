package iterator;

import java.util.Comparator;
import java.util.Objects;

import domain.Symptom;

public class ComparatorSymptomName implements Comparator<Object>{
	Object o;
	
	@Override
    public int compare(Object o1, Object o2){
		Symptom s1 = (Symptom) o1;
		Symptom s2 = (Symptom) o2;
		
        return s1.getName().compareTo(s2.getName());
    }

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Symptom other = (Symptom) obj;
		Symptom s = (Symptom) this.o;
		
		return s.getName().equals(other.getName());
	}*/
	
	
}
