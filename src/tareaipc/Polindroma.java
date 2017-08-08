
package TareaIPC;

import java.util.Scanner;

/**
 *Pruebas respectivas para la palabra palindroma
 * @author Andres
 */
public class Polindroma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner ac= new Scanner(System.in);
    int n1;
    n1=2;
    //Pedir dato de entrada 
    System.out.println("Palabras Palindromas");
     System.out.println("Ingresar Palabras Palindromas:");
     String frase=ac.nextLine();
     frase=frase.toLowerCase();
     
     //Proceso
     
     // Quitar Espacios y caracteres especiales
     
    //}
    
    //public static boolean esPalindroma (String frase){
    String aux="";
     int n=frase.length();
     for(int i=0; i < n ;i++){
        if(!(frase.substring(i, i+1).equals(" ")
                || frase.substring(i, i+1).equals("!") 
               || frase.substring(i, i+1).equals("¡") 
                || frase.substring(i, i+1).equals(".") 
                || frase.substring(i, i+1).equals(";") 
                || frase.substring(i, i+1).equals(",")
                || frase.substring(i, i+1).equals("¿")
                ||frase.substring(i, i+1).equals("?"))){
               aux +=frase.substring(i, i+1);
              
     }
     }
     System.out.println(aux);
   n=aux.length();
   for(int i=0; i< n /2; i++ ){
       if(!aux.substring(i, i+1).equals(aux.substring(n -i-1,n-i))){
    
     n1=1;
    
     }
       else{
          n1=0;
    }
    } 
     if (n1==1){
         System.out.println("No es Palindroma!");
     }   
     if (n1==0){
         System.out.println("Si es Palindroma!");
     }
    }
}
