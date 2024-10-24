package adapter2;

import java.awt.Component;
import java.awt.Font;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;
import javax.swing.table.TableModel;

import domain.Covid19Pacient;
import domain.Symptom;


public class ShowPacientTableGUI extends JFrame /*implements Observer*/{
	
	JTable table;
	Covid19Pacient pacient;
	
  
  public ShowPacientTableGUI(Covid19Pacient pacient ) {
	  
	  	this.setTitle("Covid Symptoms "+pacient.getName());
	  	
	  	this.pacient=pacient;
	  	
	  	setFonts();
	    
	  	TableModel tm=new Covid19PacientTableModelAdapter(pacient);
		table = new JTable(tm);
	    table.setRowHeight(36);
	    JScrollPane pane = new JScrollPane(table);
	    pane.setPreferredSize(
	      new java.awt.Dimension(300, 200));
	    this.getContentPane().add(pane);
	    
	  
  }
  
	//public void update(Observable o, Object args) {
		
	//}

  private static void setFonts() {
    Font font = new Font("Dialog", Font.PLAIN, 18);
    UIManager.put("Table.font", font);
    UIManager.put("TableHeader.font", font);
  }
}
