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
public class Carrera {
    /**
     * Metodo el cual estructura los datos de los hilos
     */
    public void inicio(){
        DatosCarrera datosEquipo = new DatosCarrera(101,0,33,66);
        
        Equipo equipoUno = new Equipo("EQUIPO UNO",1,datosEquipo);
        Equipo equipoDos = new Equipo("EQUIPO DOS",2,datosEquipo);
        Equipo equipoTres = new Equipo("EQUIPO TRES",3,datosEquipo);
        
        //Equipo 1
        Atleta atleta1 = new Atleta(1, "E1",equipoUno);
        Atleta atleta2 = new Atleta(1, "E1",equipoDos);
        Atleta atleta3 = new Atleta(1, "E1",equipoTres);
        //Equipo 2
        Atleta atleta4 = new Atleta(2, "E2",equipoUno);
        Atleta atleta5 = new Atleta(2, "E2",equipoDos);
        Atleta atleta6 = new Atleta(2, "E2",equipoTres);
        //Equipo 3
        Atleta atleta7 = new Atleta(3, "E3",equipoUno);
        Atleta atleta8 = new Atleta(3, "E3",equipoDos);
        Atleta atleta9 = new Atleta(3, "E3",equipoTres);
        
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
        /**
         * Se da inicio a la carrera
         */
        competencia.start();
    }
}


