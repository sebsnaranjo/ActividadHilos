/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.actividadhilos;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Principal{
    
    Scanner escaner;
    int matriz[][];
    
    public Principal(){
        this.escaner=new Scanner(System.in);
    }
    
    /*public void inicializarmatriz(){
        
    }*/
    
    public void comienzo(){
        System.out.println("Welcome");
        System.out.println("");
        System.out.println("Carrera de relevos");
        System.out.println("");
        
        //inicializarMatriz();
    }
    
    public static void main(String[] args) throws InterruptedException {
        CarreraRelevos carrera = new CarreraRelevos();
        carrera.inicio();
    }
}
