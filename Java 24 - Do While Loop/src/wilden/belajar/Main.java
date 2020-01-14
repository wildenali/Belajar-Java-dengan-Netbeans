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
        
        int a = 0;
        boolean kondisi = true;
        
        System.out.println("Ini adalah awal program");
        
        do {            
            a++;
            System.out.println("do while ke-" + a);
            
            if (a == 5) {
                kondisi = false;
            }
        } while (kondisi);
        
        System.out.println("Ini adalah akhir program");
    }
    
}
