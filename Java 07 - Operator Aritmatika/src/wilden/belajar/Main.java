/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilden.belajar;

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
        
        // Operator Aritmatika
        
        int variable1 = 10;
        int variable2 = 7;
        int hasil;
        
        // 1. Penjumlahan
        hasil = variable1 + variable2;
        System.out.println(variable1 + " + " + variable2 + " = " + hasil);
        
        // 2. Pengurangan
        hasil = variable1 - variable2;
        System.out.println(variable1 + " - " + variable2 + " = " + hasil);
        
        // 3. Perkalian
        hasil = variable1 * variable2;
        System.out.printf("%d x %d = %d \n", variable1, variable2, hasil);
        
        // 4. Pembagian
        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d \n", variable1, variable2, hasil);
        
        float a = 10;
        float b = 4;
        float hasilFloat = a/b;
        System.out.println(a + " - " + b + " = " + hasilFloat);
        
        // 5. Modulus (sisa pembagian)
        hasil = variable1 % variable2;
        System.out.printf("%d / %d = %d \n", variable1, variable2, hasil);
        
    }
    
}
