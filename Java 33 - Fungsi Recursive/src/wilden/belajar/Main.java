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
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Masukan nilai: ");
        int nilai = userInput.nextInt();
        System.out.println("Anda Memasukan nilai = " + nilai);
        
        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("Jumlah = " + jumlah);
        
        int faktorial = hitungFaktorial(nilai);
        System.out.println("Hasil faktorial = " + faktorial);
    }
    
    // Fungsi rekursif sederhana
    private static int hitungFaktorial(int parameter){
        System.out.println("Parameter = " + parameter);
        if (parameter == 1) {
            return parameter;
        }
        return parameter * hitungFaktorial(parameter - 1);
    }
    
    private static int jumlahNilai(int parameter){
        System.out.println("Parameter = " + parameter);
        
        if (parameter == 0) {
            return parameter;
        }
        return parameter + jumlahNilai(parameter - 1);
    }
    
    private static void printNilai(int parameter){
        System.out.println("Nilai = " + parameter);
        
        if (parameter == 0) {
            return;
        }
        
        parameter--;
        
        printNilai(parameter);
    }
    
}
