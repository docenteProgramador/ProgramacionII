/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaestudiante;

/**
 *
 * @author oscar
 */
public class SistemaEstudiante {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Estudiante Oscar = new Estudiante();
        Estudiante Daniel = new Estudiante(15,1.9);
        /*
        Daniel.MostrarDatos();
        System.out.println("------------------");
        Oscar.MostrarDatos();
        System.out.println("------------------");
        Daniel.MostrarDatos();
        
        Daniel.nombre = "Daniel";
        Oscar.nombre = "Oscar";
        
        Daniel.SetEdad(90);
        Oscar.SetEdad(200);
        System.out.println("");
        
        Daniel.MostrarDatos();
        Oscar.MostrarDatos();
        
        Daniel.SetEdad(50);
        Daniel.MostrarDatos();
        Daniel.SetEdad(80);
        Daniel.MostrarDatos();
        */
        
        Daniel.setDescuento(0.90);
        System.out.printf(" %.2f\n",Daniel.getDescuento());

        Daniel.SetEdad(90);
        Daniel.setDescuento(0.90);
        System.out.printf(" %.2f\n",Daniel.getDescuento());
        
        Daniel.SetEdad(50);
        Daniel.setDescuento(0.90);
        System.out.printf(" %.2f\n",Daniel.getDescuento());

        
        

    }//Fin de Main
    
    
}
