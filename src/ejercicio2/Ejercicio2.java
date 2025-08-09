/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author castillo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner lector=new Scanner(System.in);
    int edad;
    System.out.print("Ingrese la edad en años de la persona: ");
    edad=lector.nextInt();
        if (edad>=18) {
            System.out.println("La edad ingresada, pertenece a una persona mayor de edad ");
        }else{
            System.out.println("La edad ingresada, pertenece a una persona menor de edad");
        }
    }
            
    
}
