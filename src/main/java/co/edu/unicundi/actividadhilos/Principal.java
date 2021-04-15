/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.actividadhilos;

/**
 *
 * @author PC
 */
public class Principal {
    public static void main() {
       
        Object primerEquipo = new Object();
        Object segundoEquipo = new Object();
        Object tercerEquipo = new Object();
        
        CarreraRelevos corredorUnoTeamX = new Corredor("TeamX", primerEquipo, 33);
        CarreraRelevos corredorDosTeamX = new Corredor("TeamX", primerEquipo, 33);
        CarreraRelevos corredorTresTeamX = new Corredor("TeamX", primerEquipo, 34);
            
        CarreraRelevos corredorUnoTeamY = new Corredor("TeamY",segundoEquipo, 33);
        CarreraRelevos corredorDosTeamY = new Corredor("TeamY", segundoEquipo, 33);
        CarreraRelevos corredorTresTeamY = new Corredor("TeamY", segundoEquipo, 34);
                  
        CarreraRelevos corredorUnoTeamZ = new Corredor("TeamZ", tercerEquipo, 33);
        CarreraRelevos corredorDosTeamZ = new Corredor("TeamZ", tercerEquipo, 33);
        CarreraRelevos corredorTresTeamZ = new Corredor("TeamZ", tercerEquipo, 34);
        
                
    }
}
