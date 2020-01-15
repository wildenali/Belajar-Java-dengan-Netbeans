/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilden.belajar;

import java.util.*;

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
        
        // Menghitung nilai deret fibonacci ke-n
        int fn, fn_1, fn_2, n;
        
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Mengambil nilai fibonacci ke - : ");
        n = inputUser.nextInt();
        
        fn_2 = 0;
        fn_1 = 1;
        fn = 1;
        
        for (int i = 0; i <= n; i++) {
            System.out.println("Nilai ke - " + i + " adalah " + fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }
        
    }
    
}