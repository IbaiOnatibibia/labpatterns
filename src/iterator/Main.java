package iterator;

import java.util.Comparator;
import java.util.Iterator;

import domain.Covid19Pacient;
import domain.DigestiveSymptom;
import domain.NeuroMuscularSymptom;
import domain.RespiratorySymptom;
import adapter.Sorting;

	public class Main {

		public static void main(String[] args) {
			Covid19Pacient p=new Covid19Pacient("Ane", 29);
			p.addSymptom(new RespiratorySymptom("A", 10, 3), 1);
			p.addSymptom(new RespiratorySymptom("E", 10, 2), 2);
			p.addSymptom(new DigestiveSymptom("C", 10, 1), 3);
			p.addSymptom(new NeuroMuscularSymptom("B", 10, 4), 4);
			p.addSymptom(new NeuroMuscularSymptom("D", 10, 5), 5);
			
			Covid19PacientAdapter a=new Covid19PacientAdapter(p);
			Comparator<Object> c1=new ComparatorSymptomName();
			Comparator<Object> c2=new ComparatorSeverityIndex();
			
			Iterator<Object> i=p.iterator();
			System.out.println("Ordenatu gabe: ");
			while (i.hasNext()) {
				System.out.println(i.next());
			}
			System.out.println("\n");
			
			System.out.println("Izenarekin ordenatuta: ");
			Iterator<Object> i1 = Sorting.sortedIterator(a, c1);
			while (i1.hasNext()) {
				System.out.println(i1.next());
			}
			System.out.println("\n");
			
			System.out.println("Severity index-arekin ordenatuta: ");
			Iterator<Object> i2 = Sorting.sortedIterator(a, c2);
			while (i2.hasNext()) {
				System.out.println(i2.next());
			}

		}

	}

