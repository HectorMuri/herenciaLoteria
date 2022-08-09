/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apploteria;

/**
 *
 * @author m_mur
 */
public class AppLoteria {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
       // Evento nuevoEvento = new Evento("08/08/2022");
       // nuevoEvento.cambiarEstado();

        pegaTres nuevoSorteo = new pegaTres("08/08/2022",1001);
        nuevoSorteo.getFecha();
        System.out.println("Estado: "+nuevoSorteo.getEstado());
        nuevoSorteo.cambiarEstado();
        nuevoSorteo.realizarSorteo();
    
        premiaDos nuevoSorteoP2 = new premiaDos("08/08/2022",1001);
        nuevoSorteoP2.getFecha();
        System.out.println("Estado: "+nuevoSorteoP2.getEstado());
        nuevoSorteoP2.cambiarEstado();
        nuevoSorteoP2.realizarSorteo();
            
   
   
   }
    
  }
    

