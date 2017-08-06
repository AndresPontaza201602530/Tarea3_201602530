/*
 * Esto fue parte del testeo para el ingreso,buscaqueda y presentacion de datos
 */
package tareaipc;

import java.util.Scanner;

/**
 *
 * @author andres
 */
public class Usuario {
    public static void main (String[]args){
    Scanner leer= new Scanner(System.in);  //Ingreso Usuarios 
    String []arreglo =new String[5];
    String user;
    System.out.println("       Ingresar Usuario");
    for(int i=0;i<arreglo.length;i++){
    
        System.out.print((i+1)+") ");
        
    user=leer.nextLine();
    arreglo[i]=user;
    }
        int p=0;  //Deja espacio 
        for(p=0;p<3;p++){ 
        System.out.println("\n"); 
}       //
        //Muestra Usuario en el sistema
       System.out.println("            Mostrar todos los Usuarios");
      for(int i=0;i<arreglo.length;i++){
      System.out.println((i+1)+") "+arreglo[i]);
      }
      
        
       //Buscar1
       System.out.println("");
       System.out.println("");
       System.out.println("");
       System.out.println("");
       System.out.println("");
       System.out.println("");
       System.out.println("");
       System.out.println("");
       System.out.println("Buscar Usuario");
       System.out.println("");
       Scanner leer2= new Scanner(System.in);
       String buscar=leer2.nextLine();
        int posicion = -2;
        for (int inicio=0; inicio<5; inicio++){
            if(arreglo[inicio].equals(buscar)){
                posicion=inicio; 
            }
        }
             if(posicion>=0){
             System.out.println(arreglo[posicion]);
             }
             else{
             System.out.println("No se encuentra");
             }
              
    }      
    }

