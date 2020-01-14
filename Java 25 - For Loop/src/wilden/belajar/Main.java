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
        
        System.out.println("Awal Program");
        
        System.out.println("Loop pertama");
        
        for (int nilai = 0; nilai <= 10; nilai++) {
            System.out.println("for loop ke-" + nilai);
        }
        
        System.out.println("\nLoop kedua");
        for (int nilai = 0; nilai < 10; nilai++) {
            System.out.println("for loop ke-" + nilai);
        }
        
        System.out.println("\nLoop ketiga");
        for (int nilai = 10; nilai >=5; nilai--) {
            System.out.println("for loop ke-" + nilai);
        }
        
        System.out.println("\nLoop keempat");
        int nilai = 0;
        for (; nilai < 10;) {
            System.out.println("for loop ke-" + nilai);
            nilai++;
        }
        
        System.out.println("Akhir program");
    }
    
}
