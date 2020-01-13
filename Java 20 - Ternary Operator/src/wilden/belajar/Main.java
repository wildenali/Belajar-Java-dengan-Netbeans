/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilden.belajar;

import java.util.*;

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
        
        int input, x;
        
        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("Masukan nilai: ");
        input = inputUser.nextInt();
        
        // variable x = expresi ? statement_true : statement_false
        
        x = (input == 10) ? (input*input) : (input/2);
        
        System.out.println("Hasilnya " + x);
        
    }
    
}
