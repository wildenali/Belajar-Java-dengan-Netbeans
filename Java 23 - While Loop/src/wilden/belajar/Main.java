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
        
        System.out.println("Awal Program");
        
        while (kondisi) {            
            System.out.println("While loop ke-" + a);
            
            if (a == 10) {
                kondisi = false;
            }
            a++;
        }
        
        System.out.println("Akhir Program");
    }
    
}
