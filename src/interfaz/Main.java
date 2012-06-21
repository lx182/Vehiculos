/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Al3x
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo carro = new Vehiculo("Corsa");
        carro.setLlantas(4);
        carro.setOcupantes(5);
        
        Vehiculo camioneta = new Vehiculo("Redilas");
        camioneta.setLlantas(4);
        camioneta.setOcupantes(3);
        
        Vehiculo camion = new Vehiculo("Mercedez");
        camion.setLlantas(10);
        camion.setOcupantes(40);
        
        JOptionPane.showMessageDialog(null, carro);
        JOptionPane.showMessageDialog(null, camioneta);
        JOptionPane.showMessageDialog(null, camion);
        
      
        
                
        
    }
}
