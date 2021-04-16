/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.actividadhilos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ana Sofia Lopera Riveros
 * @author Frank Sebastian Naranjo
 * @version 1.0.0
 */
public class Atleta extends Thread {
    /**
     * Se declaran variables de identificacion de posiciones, de asignacion de nombre y equipos
     */
    private int id; 
    private String nombre;
    private Equipo equipo;

    public Atleta(int id, String nombre, Equipo equipo) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        identificarAtleta();
    }
    /**
     * Metodo que permite que los hilos pasen de corredor a corredor
     */
    @Override
    public void run(){
        pasoATestigo();
    }
    /**
     * Metodo el cual identifica el atleta y donde ubicado segun su hilo
     */
    private void identificarAtleta(){
        ArrayList<String> ubicacionAtleta = new ArrayList<>();
        ubicacionAtleta = equipo.getCarril();
        if(id==1){
            ubicacionAtleta.set(equipo.getDatosEquipo().getP1(),nombre);
            equipo.setCarril(ubicacionAtleta);
        } else if(id==2){
            ubicacionAtleta.set(equipo.getDatosEquipo().getP2(),nombre);
            equipo.setCarril(ubicacionAtleta);
        } else if(id==3){
            ubicacionAtleta.set(equipo.getDatosEquipo().getP3(),nombre);
            equipo.setCarril(ubicacionAtleta);
        }
    }
    /**
     * Metodo que permite iniciar a los otros atletas
     */
    private void pasoATestigo(){
        if(id==1){
            correr(equipo.getDatosEquipo().getP2());
            synchronized(equipo.getCarril().get(equipo.getDatosEquipo().getP3())){
                equipo.getCarril().get(equipo.getDatosEquipo().getP3()).notifyAll();
            }
        } else if (id==2) {
            synchronized (equipo.getCarril().get(equipo.getDatosEquipo().getP3())){
                try{
                    equipo.getCarril().get(equipo.getDatosEquipo().getP3()).wait();
                }catch(InterruptedException ex){
                    Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                correr(equipo.getDatosEquipo().getP3());
                synchronized (equipo.getNombre()){
                    equipo.getNombre().notifyAll();
                }
            } else if(id==3){
            synchronized(equipo.getNombre()){    
                try{
                    equipo.getNombre().wait();
                }catch(InterruptedException ex){
                    Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);                    
                }
            }
            correr(equipo.getDatosEquipo().getDistancia());
        }
    }
    /**
     * Metodo que permite visualizar los hilos con su respectivo moviemiento
     */
    private void correr(int posicion) {
        ArrayList<String> ubicacion = new ArrayList<>();
        int randomico;
        int posicionReal;
        int atras;
        int adelante;
        int posicionRelativa;
        if(posicion == equipo.getDatosEquipo().getDistancia()){
            posicionRelativa=posicion;
        }else{
            posicionRelativa=posicion-1;
        }
        while(equipo.getCarril().get(posicionRelativa)!=nombre) {
           ubicacion = equipo.getCarril();
           randomico=(int) ((Math.random()*3)+1);
           posicionReal=ubicacion.indexOf(nombre);
           atras = posicionRelativa-posicionReal;
           if(atras>3){
               randomico=randomico;
           } else if (atras==1){
               if(randomico>1){
                   randomico=1;
               }
           } else if (atras == 2){
               if (randomico>2){
                   randomico=1;
               }
           }
           adelante = posicionReal + randomico;
           if(adelante>=(equipo.getDatosEquipo().getDistancia()+1)){
               adelante = equipo.getDatosEquipo().getDistancia();
           } else if (adelante == (equipo.getDatosEquipo().getDistancia()-1)){
               adelante = equipo.getDatosEquipo().getDistancia();
           } else {
               adelante=adelante;
           }
           
           ubicacion.set(posicionReal, " ");
           ubicacion.set(adelante, nombre);
           equipo.setCarril(ubicacion);
           
           try {
               Thread.sleep(100);
           } catch (InterruptedException ex) {
               Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }
}
