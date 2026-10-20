/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaestudiante;

/**
 *
 * @author oscar
 */
public class Estudiante {
    
    /*
        Modificadores de Acceso
        1. public
        2. private
        3. protected
    */
    //Atributos (Variables)
    private int edad;
    private double estatura;
    private char genero;
    private double descuento;
    
    String nombre;
    String apellido;


    
    
    //Constructor
    public Estudiante(){
        this.edad = 0;
        this.estatura = 0;
        this.nombre ="John";
        this.apellido="Doe";
    }//Fin de Costructor
    
    public Estudiante(int edad, double estatura){
        this.edad = edad;
        this.estatura = estatura;
        this.nombre = "John";
        this.apellido = "Doe";
    }
    
    
    //Metodo (Funcion)
    public void MostrarDatos(){
        
        System.out.printf("Nombre: %s\n",this.nombre);
        System.out.printf("Apellido: %s\n",this.apellido);
        System.out.printf("Edad: %d\n",this.edad);
        System.out.printf("Estatura: %.2f\n",this.estatura);
    }//Fin de Metodo MostrarDatos
    
    //Getter y Setter
    //Modificar la Edad
    public void SetEdad(int edad){
        
        if(edad>0 &&edad<100){
            this.edad = edad;
        }
        else{
            System.out.println("Error ingresado");
            this.edad = 1;
        }
        
    }
    
    //Obtener la edad
    public int getEdad(){
        return this.edad;
    }
    
    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        if(genero == 'm' || genero =='f'){
            this.genero = genero;
        }
        else{
            System.out.println("No es valido otro dato F/M");
        }
    }
    
    public void setDescuento(double descuento){
        if(this.edad>80){
            descuento =0.40;
        }
        else if(this.edad>60){
            descuento = 0.25;
        }
        else if(this.edad<21){
            this.descuento = 0.10;
        }
        else{
            this.descuento = 0; 
        }   
    }
    
   public double getDescuento(){
       return this.descuento;
   }
    
}//Fin de Class Estudiante
