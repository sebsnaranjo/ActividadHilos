/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.actividadhilos;

/**
 *
 * @author ASUS
 */
public class CarreraRelevos {
    
        Carrera nuevaCarrera;
        
        CarreraRelevos(){
            this.nuevaCarrera = new Carrera();
        }
        
        public void iniciarCarrera() throws InterruptedException{
            
            Corredor corredorUnoTeamX = new Corredor(nuevaCarrera,1,0,1);
            Corredor corredorDosTeamX = new Corredor(nuevaCarrera,1,30,0);
            Corredor corredorTresTeamX = new Corredor(nuevaCarrera,1,60,0);

            Corredor corredorUnoTeamY = new Corredor(nuevaCarrera,2,0,1);
            Corredor corredorDosTeamY = new Corredor(nuevaCarrera,2,30,0);
            Corredor corredorTresTeamY = new Corredor(nuevaCarrera,2,60,0);

            Corredor corredorUnoTeamZ = new Corredor(nuevaCarrera,3,0,1);
            Corredor corredorDosTeamZ = new Corredor(nuevaCarrera,3,30,0);
            Corredor corredorTresTeamZ = new Corredor(nuevaCarrera,3,60,0);
        
            corredorUnoTeamX.start();
            corredorDosTeamY.start();
            corredorTresTeamZ.start();
            
            corredorUnoTeamX.join();
            if(corredorUnoTeamX.isAlive()==false){
                corredorDosTeamX.start();
            }
            corredorDosTeamX.join();
            if(corredorDosTeamX.isAlive()==false){
                corredorTresTeamX.start();
            }
            corredorUnoTeamY.join();
            if(corredorUnoTeamY.isAlive()==false){
                corredorDosTeamY.start();
            }
            corredorDosTeamY.join();
            if(corredorDosTeamY.isAlive()==false){
                corredorTresTeamY.start();
            }
            corredorUnoTeamZ.join();
            if(corredorUnoTeamZ.isAlive()==false){
                corredorDosTeamZ.start();
            }
            corredorDosTeamZ.join();
            if(corredorDosTeamZ.isAlive()==false){
                corredorTresTeamZ.start();
            }
            
            corredorTresTeamX.join();
            corredorTresTeamY.join();
            corredorTresTeamZ.join();
            
            if(corredorTresTeamX.isAlive()==false && corredorTresTeamY.isAlive()==true && corredorTresTeamZ.isAlive()==true){
                System.out.println(corredorTresTeamX.getId() + " ganó!.");
            }else if(corredorTresTeamX.isAlive()==true && corredorTresTeamY.isAlive()==false && corredorTresTeamZ.isAlive()==true){
                System.out.println(corredorTresTeamY.getId() + " ganó!.");
            }else if(corredorTresTeamX.isAlive()==true && corredorTresTeamY.isAlive()==true && corredorTresTeamZ.isAlive()==false){
                System.out.println(corredorTresTeamZ.getId() + " ganó!.");
            }
            
        }
    
}
