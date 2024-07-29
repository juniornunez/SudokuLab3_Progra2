/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuñez_junior_idclase;

import java.util.Scanner;

/**
 *
 * @author Junior Nuñes
 */
public class Nuñez_JuniorIDClaseVariables {
    
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        /*
        Creamos un programa simple que nos pide que ingresemos 3 notas, y luego calculamos el 
        promedio de esas notas y si este es mayor al 59.5 el alumno aprueba, si no, reprueba.
        
        */
                
        double promediofinal;
        String notafinal;
        
        System.out.println("*****Ingrese las notas del alumno*****");
        System.out.println("Ingrese notas del 0-100");
        System.out.println("Ingrese su nota numero #1");
        double promedio1=lea.nextDouble();
        System.out.println("Ingrese su nota numero #2");
        double promedio2=lea.nextDouble();
        System.out.println("Ingrese su nota numero #3");
        double promedio3=lea.nextDouble();
        
        promediofinal=(promedio1+promedio2+promedio3)/3;
        notafinal= promediofinal >=59.5? "Aprobado": "Desaprobado";
        System.out.println("Su promedio es de: "+promediofinal);
        System.out.println("Estado: "+notafinal);
}
    }