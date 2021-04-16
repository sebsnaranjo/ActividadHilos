/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.actividadhilos;

import java.util.ArrayList;

/**
 *
 * @author Ana Sofia Lopera
 * @author Frank Sebastian Naranjo
 * @version 1.0.0
 */
public class Equipo {
   /**
    * Funcion del array almacenar las posiciones de los corredores
    * Se declaran las variables para el nombre, color y el id del equipo
    * Se llama la variable que almacena los parametoros
    */
    ArrayList<String> carril = new ArrayList<>();
    private String nombre;
    private String color;
    private int id;
    private DatosCarrera datosEquipo;

    public Equipo(String nombre, int id, DatosCarrera datosEquipo) {
        this.nombre = nombre;
        this.id = id;
        this.datosEquipo = datosEquipo;
        imprimirCarrera();
        color();
    }
    /**
    * Metodo para imprimir 
    */
    private void imprimirCarrera(){
        for (int i=0;i< datosEquipo.getDistancia();i++){
           carril.add(i, " ");    
        }
        carril.add(carril.size(),"META");
    }
    /**
     * Metodo el cual dependiendo del equipo correspondiente asigna un color
     */
    private void color(){
        switch (this.id){
            case 1:
                this.color = "\u001B[31m";
                break;
            case 2:
                this.color = "\u001B[36m";
                break;
            case 3:
                this.color = "\u001B[32m";
                break;
            default:
                break;
        }
    }
    /**
     * Metodos get y set
    */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DatosCarrera getDatosEquipo() {
        return datosEquipo;
    }

    public void setDatosEquipo(DatosCarrera datosEquipo) {
        this.datosEquipo = datosEquipo;
    }

    public ArrayList<String> getCarril() {
        return carril;
    }

    public void setCarril(ArrayList<String> carril) {
        this.carril = carril;
    }
    
    
}
