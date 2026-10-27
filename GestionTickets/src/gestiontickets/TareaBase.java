/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontickets;

/**
 *
 * @author oscar
 */
public class TareaBase {
    
    //Vehiculo
    private String idTicket;
    private String titulo;
    protected boolean resuelto;
    
    public TareaBase(String idTicket, String titulo, boolean resuelto){
        this.idTicket = idTicket;
        this.titulo = titulo;
        this.resuelto = resuelto;
    }//Fin del Constructor
    
    public void marcaResuelto(){
        this.resuelto = true;
        System.out.printf("El ticket %s ha sido cerrado.\n",this.idTicket);
        System.out.printf("Nombre Ticket %s",this.titulo);
    }
    
    public int calcularPrioridad(){
        return 1;
    }
    
    
    
}//Fin de Class Tarea Base
