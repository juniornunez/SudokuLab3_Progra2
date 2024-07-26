/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuñez_junior_taller2;
import java.util.Scanner;
/**
 *
 * @author Junior Nuñes
 */
public class Nuñez_Junior_Taller2 {
    

    
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        while(true){
            System.out.println("BIENVENIDO AL MENU");
            System.out.println("1.Cadena");
            System.out.println("2.Notas");
            System.out.println("3.Clases");
            System.out.println("4.Salir");
            
            int opcion=lea.nextInt();
            
            if(opcion==1){
                
                System.out.println("Ingrese una palabra: ");
            String cadena=lea.next();
            
            int masrepetida= 0;
            char letrafrecuente=' ';
            
            int contador= 0;
            while (contador < cadena.length()){
                char caracact = cadena.charAt(contador);
                int frecact = 0;
                
            int contador2 = 0;
            while (contador2< cadena.length()){
                if (cadena.charAt(contador2)== caracact){
                    frecact=frecact+1;
                }
                contador2+=1;
            }
            if (frecact > masrepetida){
                masrepetida = frecact;
                letrafrecuente = caracact;
            }
            contador+=1;
          }
            
                System.out.println("Caracter mas frecuente es: '"+letrafrecuente+"'");
                System.out.println("Numero de veces aparecidas: "+ masrepetida);
                
            }
            
            
            
            
            
            
            else if (opcion==2){
                int contador=1;
                int cantidadnumeros=0;
                int totalnotas=0;
                double nota=0;
                double promedio=0;
                double notaMenor=100;
                double notaMayor=0;
               
                
                System.out.println("Ingrese la cantidad de notas: ");
                cantidadnumeros=lea.nextInt();
                
                
                while (contador<=cantidadnumeros){
                    System.out.println("Ingresar la nota #"+contador);
                nota=lea.nextDouble();
                
                if(nota>=0 && nota<=100){
                    contador+=1;
                    totalnotas+=nota;
                    
                    while(nota>notaMayor){
                        notaMayor=nota;
                        
                    }
                    while(nota<notaMenor){
                        notaMenor=nota;
                        
                    }
                    promedio=(totalnotas/cantidadnumeros);
                }
                
                
                
                
            }
            
                System.out.println("Promedio: "+promedio+"%");
                System.out.println("Nota mayor: "+notaMayor);
                System.out.println("Nota menor: "+notaMenor);
            
            
                
     }else if(opcion==3){
        
        
      }else if (opcion==4){ 
         break;
             
        
        
        }
    
            
            
            
    }
    } 
   }
