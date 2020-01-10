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
        // Tipe data di java:
        // integer, byte, short, long, double, float, char, boolean
        
        // integer (satuan)
        int a = 10;
        System.out.println("===== INTEGER =====");
        System.out.println("nilai integer a = " + (a + 1));
        System.out.println("Nilai max = " + Integer.MAX_VALUE);
        System.out.println("Nilai max = " + Integer.MIN_VALUE);
        System.out.println("Besar integer = " + Integer.BYTES + " bytes");
        System.out.println("Besar integer = " + Integer.SIZE + " bit");
        System.out.println();

        // byte (satuan)
        byte b = 20;
        System.out.println("===== BYTE =====");
        System.out.println("nilai byte b = " + b);
        System.out.println("Nilai max = " + Byte.MAX_VALUE);
        System.out.println("Nilai max = " + Byte.MIN_VALUE);
        System.out.println("Besar byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar byte = " + Byte.SIZE + " bit");
        System.out.println();
        
        // short (satuan)
        short c = 30;
        System.out.println("===== SHORT =====");
        System.out.println("nilai short c = " + c);
        System.out.println("Nilai max = " + Short.MAX_VALUE);
        System.out.println("Nilai max = " + Short.MIN_VALUE);
        System.out.println("Besar short = " + Short.BYTES + " bytes");
        System.out.println("Besar short = " + Short.SIZE + " bit");
        System.out.println();
        
        // short (satuan)
        long d = 40L;
        System.out.println("===== LONG =====");
        System.out.println("nilai long d = " + d);
        System.out.println("Nilai max = " + Long.MAX_VALUE);
        System.out.println("Nilai max = " + Long.MIN_VALUE);
        System.out.println("Besar long = " + Long.BYTES + " bytes");
        System.out.println("Besar long = " + Long.SIZE + " bit");
        System.out.println();
        
        // float (koma koma an, bilangan real)
        float e = -50.87f;
        System.out.println("===== FLOAT =====");
        System.out.println("nilai float e = " + e);
        System.out.println("Nilai max = " + Float.MAX_VALUE);
        System.out.println("Nilai max = " + Float.MIN_VALUE);
        System.out.println("Besar float = " + Float.BYTES + " bytes");
        System.out.println("Besar float = " + Float.SIZE + " bit");
        System.out.println();
        
        // double (koma koma an, bilangan real)
        double f = -60.66d;
        System.out.println("===== DOUBLE =====");
        System.out.println("nilai double f = " + f);
        System.out.println("Nilai max = " + Double.MAX_VALUE);
        System.out.println("Nilai max = " + Double.MIN_VALUE);
        System.out.println("Besar double = " + Double.BYTES + " bytes");
        System.out.println("Besar double = " + Double.SIZE + " bit");
        System.out.println();
        
        // char (karakter, berdasarkan ASCII)
        char g = 'w';
        System.out.println("===== CHAR =====");
        System.out.println("nilai char g = " + g);
        System.out.println("Nilai max = " + Character.MAX_VALUE);
        System.out.println("Nilai max = " + Character.MIN_VALUE);
        System.out.println("Besar char = " + Character.BYTES + " bytes");
        System.out.println("Besar char = " + Character.SIZE + " bit");
        System.out.println();
        
        // boolean (FALSE or TRUE)
        boolean h = false;
        System.out.println("===== BOOLEAN =====");
        System.out.println("nilai bool h = " + h);
        System.out.println("Nilai max = " + Boolean.TRUE);
        System.out.println("Nilai max = " + Boolean.FALSE);
        System.out.println();
        
    }
    
}
