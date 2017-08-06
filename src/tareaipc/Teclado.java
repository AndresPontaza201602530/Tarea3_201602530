/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaipc;
import java.util.Scanner;
/**
 *
 * @author andre
 */
public class Teclado {
    private Scanner sc;
 
    //</editor-fold>
   
    public Teclado() {
        sc = new Scanner(System.in);
    }
 
    
    public String getString(String titulo) {
        String s1 = "";
        while (s1.equals("")) {
            System.out.println(titulo);
            s1 = sc.nextLine(); // "Hola"
            if (!s1.matches("^[A-Za-z ]*$")) {
                s1 = "";
            }
        }
        return s1;
    }
   
   
    public int getInt(String titulo, int caracteres) {
        String s1 = "";
        while (s1.equals("")) {
            System.out.println(titulo);
            s1 = sc.nextLine(); // "Hola"
            if (!s1.matches("[0-9]{" + caracteres + "}")) { // 455
                s1 = "";
            }
        }
        return Integer.parseInt(s1);
    }
   
    
    public int getInt(String titulo) {
        String s1 = "";
        while (s1.equals("")) {
            System.out.println(titulo);
            s1 = sc.nextLine(); // "Hola"
            if (!s1.matches("[0-9]*$")) { // 455
                s1 = "";
            }
        }
        return Integer.parseInt(s1);
    }
   
    //</editor-fold>
 
}

