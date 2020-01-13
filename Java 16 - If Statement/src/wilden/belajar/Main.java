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
        
        // If
        
        int a = 5;
        int b = 10;
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        
        if (a == b) {
            System.out.printf("%d Sama dengan %d , maka jawaban True", a, b);
        }else{
            System.out.printf("%d Tidak Sama dengan %d , maka jawaban False", a, b);
        }
        
        System.out.println("\nSelesai");
        
    }
    
}
