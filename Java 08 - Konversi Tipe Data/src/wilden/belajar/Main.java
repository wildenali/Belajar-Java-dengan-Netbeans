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
        
        // Program untuk konversi data
        
        int iniInteger = 553;   // 32 bit
        System.out.println("Nilai Integer = " + iniInteger);
        System.out.println();
        
        // Memperluas rentang ke tipe data yang lebih besar
        long iniLong = iniInteger;
        System.out.println("Nilai Integer ke Nilai Long = " + iniLong);
        System.out.println();
        
        // Memperkecil rentang ke tipe data yang lebih kecil
        byte iniByte = (byte) iniInteger;
        System.out.println("Nilai Integer ke Nilai Byte = " + iniByte);
        System.out.println("Nilai Max Byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai Max Byte = " + Byte.MIN_VALUE);
        System.out.println();
        
        // Casting Pembagian
        int a = 10;
        float b = 4;
        float c = a/b;
        System.out.printf("Casting Pembagian %d / %f = %f\n", a, b, c);
        System.out.println();
        
        int x = 10;
        int y = 4;
        float z = (float)x/y;
        System.out.printf("Casting Pembagian %d / %d = %f\n", x, y, z);
        
    }
    
}
