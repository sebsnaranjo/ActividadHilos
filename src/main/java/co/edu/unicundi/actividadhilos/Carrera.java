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
        DatosCarrera datosEquipo = new DatosCarrera(101,0,33,60);
        
        Equipo equipoUno = new Equipo("Uno",1,datosEquipo);
        Equipo equipoDos = new Equipo("Dos",2,datosEquipo);
        Equipo equipoTres = new Equipo("Tres",3,datosEquipo);
        
        Atleta atleta1 = new Atleta(1, "//",equipoUno);
        Atleta atleta2 = new Atleta(1, "//",equipoDos);
        Atleta atleta3 = new Atleta(1, "//",equipoTres);
        
        Atleta atleta4 = new Atleta(2, "()",equipoUno);
        Atleta atleta5 = new Atleta(2, "()",equipoDos);
        Atleta atleta6 = new Atleta(2, "()",equipoTres);
        
        Atleta atleta7 = new Atleta(3, "[]",equipoUno);
        Atleta atleta8 = new Atleta(3, "[]",equipoDos);
        Atleta atleta9 = new Atleta(3, "[]",equipoTres);
        
        CarreraRelevos competencia = new CarreraRelevos(equipoUno, equipoDos, equipoTres);
        
        atleta1.start();
        atleta2.start();
        atleta3.start();
        atleta4.start();
        atleta5.start();
        atleta6.start();
        atleta7.start();
        atleta8.start();
        atleta9.start();
        
        competencia.start();
    }
}


