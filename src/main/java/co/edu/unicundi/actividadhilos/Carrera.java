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
public class Carrera {
  
   
    public void inicio(){
        DatosCarrera datosEquipo = new DatosCarrera(40,0,20,30);
        
        Equipo equipoUno = new Equipo("Uno",1,datosEquipo);
        Equipo equipoDos = new Equipo("Dos",2,datosEquipo);
        Equipo equipoTres = new Equipo("Tres",3,datosEquipo);
        
        Atleta atleta1 = new Atleta(1, "A",equipoUno);
        Atleta atleta2 = new Atleta(2, "B",equipoUno);
        Atleta atleta3 = new Atleta(3, "C",equipoUno);
        
        Atleta atleta4 = new Atleta(1, "A",equipoDos);
        Atleta atleta5 = new Atleta(2, "B",equipoDos);
        Atleta atleta6 = new Atleta(3, "C",equipoDos);
        
        Atleta atleta7 = new Atleta(1, "A",equipoTres);
        Atleta atleta8 = new Atleta(2, "B",equipoTres);
        Atleta atleta9 = new Atleta(3, "C",equipoTres);
        
        
        
    
    
    }
    }


