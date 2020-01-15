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
        
        // y = (x + 2) * x
        
        int y,x;
        
        x = 5;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);
        
        x = 20;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);
        
        x = 40;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);
    }
    
    public static int hitung(int input) {
        int hasil;
        hasil = input * input;
        return hasil;
    }
    
}
