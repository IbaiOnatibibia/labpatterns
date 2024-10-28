package iterator;

import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import domain.Covid19Pacient;
import domain.DigestiveSymptom;
import domain.NeuroMuscularSymptom;
import domain.RespiratorySymptom;
import domain.Symptom;

	public class Main {

		public static void main(String[] args) {
			Covid19Pacient p=new Covid19Pacient("Ane", 29);
			p.addSymptom(new RespiratorySymptom("s1", 10, 10), 1);
			p.addSymptom(new RespiratorySymptom("s2", 10, 10), 2);
			p.addSymptom(new DigestiveSymptom("s3", 10, 10), 3);
			p.addSymptom(new NeuroMuscularSymptom("s4", 10, 10), 4);
			p.addSymptom(new NeuroMuscularSymptom("s5", 10, 10), 5);
			
			Iterator i=p.iterator();
			while(i.hasNext())
				System.out.println(i.next());

		}

	}

