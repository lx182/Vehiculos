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
public class Vehiculo {
    private String Nombre;
    private int ocupantes, llantas;
    private boolean cinturon;
    
    public Vehiculo(String n)
    {
        this.Nombre = n;
        this.cinturon = false;
    }
           

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }


    /**
     * @return the ocupantes
     */
    public int getOcupantes() {
        return ocupantes;
    }

    /**
     * @param ocupantes the ocupantes to set
     */
    public void setOcupantes(int ocupantes) {
        this.ocupantes = ocupantes;
    }

    /**
     * @return the llantas
     */
    public int getLlantas() {
        return llantas;
    }

    /**
     * @param llantas the llantas to set
     */
    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }
    
    
    @Override
    public String toString(){
        return this.getNombre() + " puede llevar a " + this.getOcupantes() + " gracias a sus "+ this.getLlantas();
    }
    
    public void abrocharCinturon()
    {
        
        
    }

    /**
     * @return the cinturon
     */
    public boolean isCinturon() {
        return cinturon;
    }

    /**
     * @param cinturon the cinturon to set
     */
    public void setCinturon(boolean cinturon) {
        this.cinturon = cinturon;
    }
    
    
    
}
