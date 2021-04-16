/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.actividadhilos;

/**
 *
 * @author Ana Sofia Lopera
 * @author Frank Sebastian Naranjo
 * @version 1.0.0
 */
public class DatosCarrera {
    /**
     * Variables para guardar la distancia y posiciones
     */
    private int distancia;
    private int p1;
    private int p2;
    private int p3;
    /**
    * Metodos set y get
    */
    public DatosCarrera(int distancia, int p1, int p2, int p3) {
        this.distancia = distancia;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getP3() {
        return p3;
    }

    public void setP3(int p3) {
        this.p3 = p3;
    }
    
    
}
