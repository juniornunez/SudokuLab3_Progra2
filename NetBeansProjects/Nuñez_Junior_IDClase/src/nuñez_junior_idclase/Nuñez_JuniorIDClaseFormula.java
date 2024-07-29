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
public class Nuñez_JuniorIDClaseFormula {
    public static void main(String[]args){
        Scanner lea=new Scanner(System.in);
        String ParoImpar;
        /*
        Creamos un programa que nos permita resolver una ecuacion 
        matematica y determinar si nuestro resultado es par o es impar.
        
        */
        System.out.println("La formula es : 4a * 7b");
        System.out.println("Ingrese su variable 'a'");
        double a=lea.nextDouble();
        System.out.println("Ingrese su variable 'b'");
        double b=lea.nextDouble();
        
        double resultado= (4 * a + 7 * b);
        System.out.println("Su respuesta es: "+resultado);
        ParoImpar= (resultado % 2==0)? "Par":"Impar";
        System.out.println("Estado: "+ ParoImpar);
}
}