/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.actividadhilos;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Corredor extends Thread {
    
    Random random;
    Carrera nuevaCarrera;
    int numeroPista;
    int inicio;
    int fin;
    
    int llegada=0;
    int comienzo = 0;
    
    Corredor(Carrera nuevaCarrera, int i, int inicio, int fin){ 
    
    this.random= new Random();
    
    this.nuevaCarrera=nuevaCarrera;
    this.numeroPista= i ;
    this.inicio=inicio;
    
    if(inicio!=60){
        this.fin=this.inicio+30;
    }else
        this.fin=this.inicio+40;
    this.comienzo=comienzo;
    
}
    public void setComienzo(int comienzo){
        this.comienzo=comienzo;
    }
    
    public void run(){
        
        long id=getId();
        int avance= random.nextInt(2)+1;
        
        int posicionActual=inicio;
        while(posicionActual+avance<fin){
            try{
                sleep(1000);
                posicionActual=nuevaCarrera.avance(numeroPista, avance, posicionActual);
                System.out.println("El competidor" + id + "Va por el Carril: " + numeroPista);
                System.out.println("El competidor" + id + "Tiene la posicion: " + (posicionActual+1) + "Y ha recorrido " + avance +"pasos" );
                System.out.println("");
                System.out.println("");
                
                avance=random.nextInt(2)+1;
                while(posicionActual+avance==fin+1){
                    avance=random.nextInt(2)+1;
                }
                 
            }catch(InterruptedException ex){
                Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null,ex);           
            }
        }if (posicionActual+avance==fin-1){
            posicionActual= nuevaCarrera.avance(numeroPista, avance, posicionActual);
            System.out.println("El competidor" + id + "Va por el Carril: " + numeroPista);
            System.out.println("El competidor" + id + "Tiene la posicion: " + (posicionActual+1) + "Y ha recorrido " + avance +"pasos" );
            System.out.println("");
            System.out.println("");
        }if (posicionActual==fin)
            llegada++;
    }
}
