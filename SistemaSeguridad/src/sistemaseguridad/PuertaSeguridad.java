package sistemaseguridad;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oscar
 */
public class PuertaSeguridad {
    
    //Atributos
    private int pinMaestro;
    private boolean puertaAbierta;
    private boolean modoLockdown;
    private int bateriaRespaldo;
    
    //Constructor
    public PuertaSeguridad(int pinInicial){
        this.pinMaestro = pinInicial;
        this.puertaAbierta = false;
        this.modoLockdown = false;
        this.bateriaRespaldo = 100;
    }//Fin de Constructor
    
    public void cambiarPin(int pinActual, int pinNuevo){
        if(pinActual == this.pinMaestro){
            if(pinNuevo>=1000 && pinNuevo<=9999){
                this.pinMaestro = pinNuevo;
                System.out.println("Pin Actualizado");
            }
            else{
                System.out.println("Pin Fuera de Rango");
            }
        }else{
            System.out.println("Pin Actual es Incorrecto");
        }
    }//Fin Funcion SETTER cambiarPin
    
    public boolean validarPin(int pinIntento){
        boolean resultado;
        
        if(this.pinMaestro == pinIntento){
            resultado = true;
        }
        else{
            resultado = false;
        }
        return resultado;
    }//Fin Getter Pin Maestro Validado
    
    public void activarLockdown(){
        this.modoLockdown = true;
        this.puertaAbierta = false;
        System.out.println("Lock Down Activado....modo encierro!!");
    }//Fin Funcion SET LockDown
    
    public void desactivarLockdown(){
        this.modoLockdown = false;
        System.out.println("Lock Down Desactivado..modo normal operacion");
    }
    
    public boolean getModoLockDown(){
        return modoLockdown;
    }
    
    public int getEstadoBateriaRespaldo(){
        return bateriaRespaldo;
    }
    
    public boolean getEstadoPuerta(){
        return puertaAbierta;
    }
    
    public void setPuerta(boolean modoPuerta){
        this.puertaAbierta = modoPuerta;
    }
    
    public void setBateriaRespaldo(int bateria){
        if(bateria<0){
            this.bateriaRespaldo = 0;
        }else if(bateria>100){
            this.bateriaRespaldo = 100;
        }else{
            this.bateriaRespaldo = bateria;    
        }
    }//Fin Funcion SETTER BateriaRespaldo
    
}//Fin de Class Puerta Seguridad
