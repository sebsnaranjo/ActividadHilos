/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.actividadhilos;

import java.util.concurrent.locks.ReentrantLock;


/**
 *
 * @author PC
 */
public class Carrera {
    private final ReentrantLock lock;
    int carrera[][];

    public Carrera() {
        this.lock = new ReentrantLock(true);
        this.carrera = new int[2][100];
    }
    
    public void matriz(){
        int filas=0;
        int columnas=0;
        
        while(filas<carrera.length){
            System.out.println("fila: " + (filas +1) + " columna: " + (columnas +1) + " " + carrera[filas][columnas]);
            if(columnas==carrera[0].length-1){
                filas++;
                columnas=0;
            }else{
                columnas++;
            }
        }
    }
    public synchronized int avance(int linea, int avanceCompetidor, int columnaActual){
            
            lock.lock();

            try{
                if(linea>=0 && linea<carrera.length){
                    for(int i = 1; i<=avanceCompetidor; i++){
                        carrera[linea][columnaActual+i]=1;
                    }
                }
            } finally {
                lock.unlock();
            }
            return columnaActual+=avanceCompetidor;
        }
    }


