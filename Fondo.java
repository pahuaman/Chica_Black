/**
 * @(#)Fondo.java
 *
 *
 * @author 
 * @version 1.00 2016/7/30
 * En esta clase solo colocaremos la imagen de nuestro  primer JPanel
 */

import java.awt.*;
import javax.swing.*;

public class Fondo extends JPanel {

    public Fondo() {
    	
        FlowLayout Z = new FlowLayout();
		Z.setAlignment(FlowLayout.CENTER);
		Z.setHgap(20);
		Z.setVgap(30);
		setLayout(Z);
		
	}//constructor
	
  public void paintComponent (Graphics g){
     
     Dimension tamanio = getSize();
     
     ImageIcon imagenFondo = new ImageIcon(getClass().getResource("lurdez.jpg")); //si dice .JPEG poner ".jpg"
     
     g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);
     
     setOpaque(false);
     
     super.paintComponent(g);
     }//metodo paintComponent
    
    
}//class