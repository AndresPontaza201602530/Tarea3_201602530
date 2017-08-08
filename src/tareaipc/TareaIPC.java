/*
 *Trabajo Principal Finalizado 
 */
package tareaipc;

import java.util.Scanner;


/**
 *
 * @author andreS
 */
public class TareaIPC {
 public static void main (String[]args){
   Teclado in=new Teclado();
   while(true){
   System.out.println("         Tarea 3");
   System.out.println("");
   System.out.println("        201602530");
   System.out.println("");
   System.out.println("1. Usuario");
   System.out.println("2. Palabra Palíndroma");
   System.out.println("3. Salir");
   int opcion= in.getInt("Escribrir numero de opción: ");
   opciones(opcion);
   
   }
 }
    public static void opciones(int opcion){
        switch (opcion) {
            case 1:
                int saltos = 8; 
                for(int i = 0; i < saltos; i++){ 
                System.out.println(); 
                }     
                Teclado in=new Teclado();
                System.out.println("     Menu Usuarios");
                System.out.println("");
                System.out.println("1. Ingresar Usuarios");
                System.out.println("2. Mostrar todos los Usuarios");
                System.out.println("3. Mostrar un Usuario Personalizado");
                System.out.println("4. Menú Principal");
                System.out.println("5. Salir");
                int opcion2= in.getInt("Escribrir numero de opción: ");
                switch (opcion2){
                    case 1:
                        int saltos2 = 15; 
                for(int i = 0; i < saltos2; i++){ 
                System.out.println(); 
                }     
                        
                        Scanner leer= new Scanner(System.in);  //Ingreso Usuarios 
                        String []arreglo =new String[5];
                        String user;
                        System.out.println("       Ingresar Usuario");
                        for(int i=0;i<arreglo.length;i++){
    
                        System.out.print((i+1)+") ");
        
                        user=leer.nextLine();
                        arreglo[i]=user;
    }
         
                int m= in.getInt("Desea mostrar los usuarios registrados si es asi pulse 1 encaso contrario cualquier otro numero? ");
                 
                
                while(m==1){
                 System.out.println("            Mostrar todos los Usuarios");
                for(int i=0;i<arreglo.length;i++){
                System.out.println((i+1)+") "+arreglo[i]);
                    }
                m=0;
                }
                m= in.getInt("Desea buscar usuarios registrados si es asi pulse 1 encaso contrario cualquier otro numero: ");
                 
                while(m==1){
                int p2=0;  //Deja espacio 
                for(p2=0;p2<3;p2++){ 
                System.out.println("\n");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                m=0;
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
             System.out.println("Si se encuentra es: "+arreglo[posicion]);
             }
             else{
             System.out.println("No se encuentra");
             }
              
                }
               
                } 
                
                int p=0;  //Deja espacio 
                for(p=0;p<3;p++){ 
                System.out.println("\n"); 
                }
 
                    
                break;
                    case 2:
                        String array1[];
                        array1= new String[5];
                        array1[0]="1) Andres";
                        array1[1]="2) Jose";
                        array1[2]="3) Juan";
                        array1[3]="4) Paola";
                        array1[4]="5) Pablo";
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("Usuarios registrados:");    
                        System.out.println(array1[0]);
                        System.out.println(array1[1]);
                        System.out.println(array1[2]);
                        System.out.println(array1[3]);
                        System.out.println(array1[4]);
                        

                        break;
                    case 3:
                        String array2[];
                        array2= new String[5];
                        array2[0]="Andres";
                        array2[1]="Jose";
                        array2[2]="Juan";
                        array2[3]="Paola";
                        array2[4]="Pablo";
         
       System.out.println("");
       System.out.println("");
       System.out.println("");
       System.out.println("Buscar Usuario");
       System.out.println("");
       Scanner leer2= new Scanner(System.in);
       String buscar=leer2.nextLine();
        int posicion = -2;
        for (int inicio=0; inicio<5; inicio++){
            if(array2[inicio].equals(buscar)){
                posicion=inicio; 
            }
        }
             if(posicion>=0){
             System.out.println("Si se encuentra registrado "+array2[posicion]);
             System.out.println(" ");
             }
             else{
             System.out.println("No se encuentra");
             System.out.println(" ");
             }
                        break;
                    case 4:
                   System.out.println(" ");
                   System.out.println(" ");
                   System.out.println(" ");
                   System.out.println(" ");
                   System.out.println(" ");
                   System.out.println(" ");
                   System.out.println(" ");
                   System.out.println(" ");
                   System.out.println(" ");
                   System.out.println(" ");
                        
                        break;
                    case 5:
                        System.exit(0);
                        break;
                }
                   break;
            case 2:
                   Scanner ac= new Scanner(System.in);
    int n1;
    n1=2;
    //Pedir dato de entrada 
    System.out.println(" ");
                   System.out.println(" ");
                   System.out.println(" ");
                   System.out.println(" ");
                   System.out.println(" ");
                   System.out.println(" ");
                   System.out.println(" ");
                   System.out.println(" ");
                   System.out.println(" ");
                   System.out.println(" ");
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
     //System.out.println(aux);
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
         System.out.println(" ");
                   System.out.println(" ");
                   System.out.println(" ");
                  
     }   
     if (n1==0){
         System.out.println("Si es Palindroma!");
         System.out.println(" ");
         System.out.println(" ");
     }
//}

                  
       
       
                    
                   break;
            case 3:
                   System.exit(0);
                   break;
        }
    
    }
    
 }    

