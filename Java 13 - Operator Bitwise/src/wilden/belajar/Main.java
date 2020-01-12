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
        
        /*
        Operator Bitwise -- > operator untuk melakukan
        operasi pada nilai bit
        */
        
        byte a = 12;
        byte b,c;
        String a_bits, b_bits, c_bits;
        
        // Operator SHIFT LEFT
        System.out.println("========== SHIFT LEFT (<<) ==========");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');     // Cara konversi dari byte to binner
        System.out.printf("%s = %d\n", a_bits, a);
        b = (byte)(a << 3);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n\n", b_bits, b);
        
        // Operator SHIFT RIGHT
        System.out.println("========== SHIFT RIGHT (>>) ==========");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits, a);
        b = (byte)(a >> 2);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n\n", b_bits, b);
        
        // Operator OR
        System.out.println("========== OR (|) ==========");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n", b_bits, b);
        System.out.println("------------------------ OR");
        c = (byte)(a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d\n\n", c_bits, c);
        
        // Operator AND
        System.out.println("========== AND (&) ==========");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n", b_bits, b);
        System.out.println("------------------------ OR");
        c = (byte)(a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d\n\n", c_bits, c);
        
        // Operator XOR
        System.out.println("========== XOR (^) ==========");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n", b_bits, b);
        System.out.println("------------------------ OR");
        c = (byte)(a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d\n\n", c_bits, c);
        
        // Operator NOT
        System.out.println("========== NOT (~) ==========");
        a = 24;
        b = (byte) (~a);
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits, a);
        System.out.println("--------------------NOT");
        b_bits = String.format("%8s",Integer.toBinaryString(b).substring(24));
        System.out.printf("%s = %d \n",b_bits, b);
        
    }
    
}
