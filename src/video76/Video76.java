/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video76;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author gleez
 */
public class Video76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoAccion marco = new MarcoAccion(); 
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        marco.setVisible(true); 
    }
    
}
class MarcoAccion extends JFrame{
    
    public MarcoAccion(){
        
        setTitle("Prueba Acciones"); 
        setBounds(600, 350, 600, 300);
        
        PanelAccion lamina = new PanelAccion(); 
        add(lamina); 
        
    }
}
class PanelAccion extends JPanel{
    public PanelAccion(){
        JButton botonAmarillo = new JButton("Amarillo"); 
        JButton botonAzul = new JButton("Azul");
        JButton botonRojo = new JButton("Rojo");
        
        add(botonAmarillo); 
        add(botonAzul); 
        add(botonRojo); 
        
    }
}

class AccionColor extends AbstractAction{

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}