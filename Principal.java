/**
 * @(#)Principal.java
 *
 *
 * @author 
 * @version 1.00 2016/7/30
 * En la clase principal solo colocaremos los JPanel´s y correspondientes creados en la demás clases(JPanel´s)
 */
import java.awt.*;
import javax.swing.*;

public class Principal extends JFrame {
     Fondo  chica;
     Opcion compon;
    
    public Principal() {
    	super("Muchacha Del Camion");
    	setBounds(200,200,265,500);
    	//setBounds(200,200,500,265);
    	setVisible(true);
    	setResizable(false);
    	
    	Container contentpane = getContentPane();
    	contentpane.setLayout(new GridLayout(2,1));
    	
    	chica  = new Fondo();
        compon = new Opcion(); 
        
        contentpane.add(chica);
        contentpane.add(compon); 
    	
    	paint(getGraphics());
    	
    }//constructor
    
    
    public static void main(String[] args) {
         Principal X = new Principal();
    }//main
    
}//Class
