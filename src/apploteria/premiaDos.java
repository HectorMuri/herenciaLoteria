/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apploteria;

import java.util.Random;

/**
 *
 * @author m_mur
 */
public class premiaDos extends Evento {
    
    private int ganadorP2[] = new int[2];
    private int premiosP2[]={100,100000};
    private int numeroSorteoP2;

    premiaDos(String fecha, int numeroSorteo){
        super(fecha);
        this.numeroSorteoP2 = numeroSorteoP2;
    }

    public void realizarSorteo(){
      Random rand = new Random();
      int numeroMax = 100;
        //generate random values from 0-99
      for(int cont=0; cont<3; cont++){
            ganadorP2[cont] = rand.nextInt(numeroMax); 
            System.out.println("Numero Ganador: " + ganadorP2[cont]);
        }  
    }
    
    public void buscarGanadores(){
        
        
        
    
    
}
}