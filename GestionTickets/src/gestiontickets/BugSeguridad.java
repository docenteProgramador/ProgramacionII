/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontickets;

/**
 *
 * @author oscar
 */
public class BugSeguridad extends Bugs{
    private String codigoCVE;
    private boolean datosExpuestos;
    
    public BugSeguridad(String idTicketNIETO, String idTituloNIETO, boolean resueltoNIETO,
                        String entornoHIJO, 
                        String codigoCVE, boolean datosEXP){
        super(idTicketNIETO,idTituloNIETO,resueltoNIETO,entornoHIJO);
        this.codigoCVE = codigoCVE;
        this.datosExpuestos = datosEXP;
    }
    
    
    
}//Fin Class BugSeguridad
