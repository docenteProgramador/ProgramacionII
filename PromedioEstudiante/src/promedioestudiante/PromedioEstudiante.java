/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedioestudiante;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class PromedioEstudiante {

    /**
     * Estructura de Secuencia
     *  Tipos de Variables
     *  Impresion de Datos y Mensajes
     *  Captura de Datos
     * 
     * Estructuras de Seleccion
     *  Simple, Doble, Anidado
     *  Operadores Booleanos
     *  Multiple
     * 
     * Estructuras de Repeticion
     *   While
     *   do while
     *   For
     * 
     * @param args the command line arguments
     * Desarrollar un algoritmo que me permita ingresar
     * las tres notas de un estudiante para poder calcular 
     * el promedio y determinar con ello si aprueba (>70) o
     * no la asignatura.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        /*     
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        double promedio =0;
        String nombre ="John Doe";
        */
        /*
        System.out.print("Ingresa la 1ra Nota: ");
        nota1 = scan.nextInt();
        
        System.out.print("Ingresa la 2da Nota: ");
        nota2 = scan.nextInt();
        
        System.out.print("Ingresa la 3ra Nota: ");
        nota3 = scan.nextInt();
        */
        Estudiante Carlos = new Estudiante();
        Estudiante Rocio = new Estudiante();
        
        Carlos.nota1 = Carlos.IngresoNota(scan, "1ra");
        Carlos.nota2 = Carlos.IngresoNota(scan, "2da");
        Carlos.nota3 = Carlos.IngresoNota(scan, "3ra");
        
        Rocio.nota1 = Rocio.IngresoNota(scan, "1ra");
        Rocio.nota2 = Rocio.IngresoNota(scan, "2da");
        Rocio.nota3 = Rocio.IngresoNota(scan, "3ra");
        
        Carlos.promedio = Carlos.CalculoPromedio(  Carlos.nota1, 
                                            Carlos.nota2, 
                                            Carlos.nota3);
        
        Rocio.promedio = Rocio.CalculoPromedio(  Rocio.nota1, 
                                            Rocio.nota2, 
                                            Rocio.nota3);
        
        if (Carlos.promedio >= 70){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
        }
        
        if (Rocio.promedio >= 70){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
        }
    }//Fin Main
    /*
    public static int IngresoNota(Scanner scan, String numNota){
        int notaTemporal = 0;
        
        System.out.printf("Ingresa la %s Nota: ",numNota);
        notaTemporal = scan.nextInt();
        
        notaTemporal = ValidarNota(notaTemporal, 0, 100);
        
        return notaTemporal;
    }//Fin de IngresoNota
    
    public static int ValidarNota(int nota, int limINF, int limSUP){
        Scanner scan = new Scanner(System.in);
        do{
            if(nota<limINF || nota>limSUP){
                System.out.println("Nota Fuera de Rango");
                System.out.printf("Limites son %d - %d \n",limINF,limSUP);
                System.out.println("Ingrese nuevamente la nota");
                System.out.print("Nota: ");
                nota = scan.nextInt();
            }
        
        }while(nota<limINF || nota>limSUP);
        return nota;
    }//Fin de ValidarNota
    
    
    public static double CalculoPromedio (int n1, int n2, int n3){
        double valorTemporal = 0;
        
        valorTemporal = (n1+n2+n3)/3;
        return valorTemporal;
    }//Fin de Calculo Promedio
    */
}//Fin Class
