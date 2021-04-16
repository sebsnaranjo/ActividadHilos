/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.actividadhilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ana Sofia Lopera
 * @author Frank Sebastian Naranjo
 * @version 1.0.0
 */
public class CarreraRelevos extends Thread{
    
    /**
     * Se declaran las varianbles de Equipo
     * Y se  crear el constructor para acceder a los datos
     */
    
    private Equipo e1;
    private Equipo e2;
    private Equipo e3;

    public CarreraRelevos(Equipo e1, Equipo e2, Equipo e3) {
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }
    /**
     * Metodo que permite el funcionamiento de los hilos
     */  
    public void run(){
        boolean identificador = false;
        do {
            mostrarCarrera(e1);
            mostrarCarrera(e2);
            mostrarCarrera(e3);
            System.out.println("\n");
            identificador = meta();
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(CarreraRelevos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (identificador == false); 
    }
    /**
     * Metodo que se encargara de imprimir la carrera
     */      
    private void mostrarCarrera(Equipo equipo){
        for (Object objects : equipo.getCarril()){
            System.out.print(equipo.getColor() + objects + "\u001B[0m");
        }
        System.out.println();
    } 
    /**
     * Metodo que se encarga de identificar al ganador
     */
    private boolean meta(){
        boolean meta = false; 
        String meta1 = e1.getCarril().get(e1.getDatosEquipo().getDistancia());
        String meta2 = e2.getCarril().get(e2.getDatosEquipo().getDistancia());
        String meta3 = e3.getCarril().get(e3.getDatosEquipo().getDistancia());
            if (meta1 != "META"){
               System.out.println("¡EL GANADOR ES: " + e3.getColor() + e1.getNombre() + "!");
               meta = true;
            } else  if (meta2 != "META"){
               System.out.println("¡EL GANADOR ES: " + e2.getColor() + e2.getNombre() + "!");
               meta = true;
            }else if (meta3 != "META"){
               System.out.println("¡EL GANADOR ES: " + e3.getColor() + e3.getNombre() + "!");
               meta = true;
            }
        return meta;
    }       
}
