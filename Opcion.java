/**
 * @(#)Opcion.java
 *
 *
 * @author 
 * @version 1.00 2016/7/30
 * En este JPanel colocaremos los componentes faltantes al proyecto, 3 JLabel´s y 2 JButton´s se acabaron necesitando varios "Espacios"
 * aunque al final no quedo tan bien como esperariamos XD ... Tu gfa :v 
 */

import java.awt.*;
import javax.swing.*;


public class Opcion extends JPanel {
	//atributos
	JLabel  que, presiona, nombre;
	JButton nada, matarte;
	JLabel  Espacio1, Espacio2, Espacio3, Espacio4, Espacio5, Espacio6, Espacio7; 

    public Opcion() {
    	
        FlowLayout M = new FlowLayout();
    	M.setAlignment(FlowLayout.CENTER);
    	//M.setHgap(20);
    	M.setVgap(20);
        setLayout(M);
    	
    	
    	nombre   = new JLabel("LURDEZ BLACK");
        que      = new JLabel("QUE VOY A HACER CONTIGO?");
        nada     = new JButton("NADA");
        matarte  = new JButton("MATARTE");
        presiona = new JLabel("PRESIONA UN BOTON");
        Espacio1 = new JLabel("                      ");
        Espacio2 = new JLabel("                         ");
        Espacio3 = new JLabel("                               ");
        Espacio4 = new JLabel("                           ");
        Espacio5 = new JLabel("                 ");
        
        Espacio6 = new JLabel("               ");
        Espacio7 = new JLabel("                       ");
        
        add(Espacio5);
        add(nombre);
        add(Espacio1);
        add(Espacio6);
        add(que);
        add(Espacio2);
        add(nada);
        add(Espacio3);
        add(Espacio7);
        add(matarte);
        add(Espacio4);
        add(presiona);
        
    }//constructor
    
}//Class