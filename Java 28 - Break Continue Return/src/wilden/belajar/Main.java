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
        
        while (true) {            
            a++;
            
            if (a == 10) {
                break;
            } else if (a == 5) {
                continue;
            } else if (a == 8) {
                return;
            }
            
            System.out.println("looping ke - : " + a);
        }
        
        System.out.println("Akhir dari looping");
    }
    
}
