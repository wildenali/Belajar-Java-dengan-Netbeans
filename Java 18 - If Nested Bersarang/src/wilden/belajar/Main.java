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
        
        int a = 5;
        int b = 10;
        
        System.out.println("Ini adalah awal dari program");
        
        if (a == 5) {
            if (b == 10) {
                System.out.println("Ini adalah dimana a = 5 dan b = 10");
            } else {
                System.out.println("Ini adalah dimana a = 5 dan b bukan 10");
            }
        } else {
            System.out.println("Ini adalah dimana a salah");
        }
        
        System.out.println("Ini akhir program");
    }
    
}
