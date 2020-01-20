/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilden.belajar;

import java.util.Scanner;

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
        
        int[] arrayData = {0, 1, 2, 3};
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("data ke-: ");
        int indexInput = userInput.nextInt();
        
        // Exception Biasa
        System.out.println("\n===== EXCEPTION Biasa =====");
        try {
            System.out.printf("Data dari array ke-%d adalah %d\n\n", indexInput, arrayData[indexInput]);
        } catch (Exception e) {
            System.err.println(e);
        }
        
        // Exception dalam Fungsi
        System.out.println("\n===== EXCEPTION dalam FUNGSI =====");
        int data = ambilDataDariArray(arrayData, indexInput);
        System.out.printf("Data dari array ke-%d adalah %d\n\n", indexInput, data);
        
        
        
    }
    
    
    private static int ambilData(int[] array, int index) throws Exception {
        int hasil = array[index];
        return hasil;
    }
    
    private static int ambilDataDariArray(int[] array, int index){
        int hasil = 0;
        
        try {
            hasil = array[index];
        } catch (Exception e) {
            System.err.println(e);
        }
        
        return hasil;
    } 
    
}
