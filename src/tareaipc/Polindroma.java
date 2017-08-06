
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
     
        System.out.println("Palabras Palindromas ");
        System.out.println("Ingresar Palabra");
        Scanner pal = new Scanner(System.in);
            //String cop=pal.nextLine();
            //cop=cop.replaceFirst(" ", "");
            String str = pal.nextLine();
                    int cont = 1;
                    for (int i = 0; i < str.length(); i++){
                        if (str.charAt(i) !=str.charAt(str.length()-1-i)){
                         
                        cont = 0; break;   
                    }
                }
    
               System.out.println(cont==1 ? "SI ES PALINDROMA!!!" : "NO ES PALINDROMA!!!");
    }
    
}
