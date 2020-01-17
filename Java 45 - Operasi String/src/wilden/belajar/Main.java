/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilden.belajar;

import java.util.Scanner;
import java.lang.String;

/**
 *
 * @author wilden
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String kalimat = "Saya suka makan kamu";
        
        // MENGAMBIL komponen dari String
        System.out.println("===== AMBIL komponen String =====");
        System.out.println(kalimat.charAt(5));
        
        System.out.println("\n===== SUBSTRING =====");
        String kata = kalimat.substring(10,15);
        System.out.println(kata);
        
        System.out.println("\n===== CONCATENATION (Concat) =====");
        String kalimat2 = kata + " lem";
        System.out.println(kalimat2);
        
        kata = kata + " aibon";
        System.out.println(kata);
        
        System.out.println("\n===== CONCAT dgn NON String =====");
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah;  // casting
        System.out.println(kalimat3);
        System.out.println(kata + " " + jumlah);
        
        System.out.println("\n===== lowercase dan UPPERCASE =====");
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());
        
        System.out.println("\n===== REPLACE =====");
        String kalimat4 = kalimat.replace("kamu", "cilok");
        System.out.println(kalimat);
        System.out.println(kalimat4);
        
        System.out.println("\n===== COMPARE =====");
        String kalimat5 = "cilok pedas";
        String kalimat6 = "cilok manis";
        System.out.println(kalimat5.compareTo(kalimat6));
        System.out.println(kalimat6.compareTo(kalimat5));
        
        String gorengan1 = "bakwan";
        String gorengan2 = "bakwan";
        System.out.println(gorengan1.compareTo(gorengan2));
        System.out.println(gorengan2.compareTo(gorengan1));
        
        System.out.println("\n===== EQUALITY (Persamaan) =====");
        String kataInput = "test";      // ini ada di string pool
        String kataTest = "test";
        if (kataInput == kataTest) {
            System.out.println("SAMA");
        } else {
            System.out.println("TIDAK");
        }
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("\n ====== Mengambil Input String dari User: ");
        kataInput = userInput.next();
        System.out.println("Ini adalah input user: " + kataInput);
        
        if (kataInput.equals(kataTest)) {
            System.out.println("SAMA");
        } else {
            System.out.println("TIDAK SAMA");
        }
    }
    
}
