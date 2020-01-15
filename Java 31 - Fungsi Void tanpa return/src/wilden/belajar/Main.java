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
        
        System.out.println(simple());
        
        fungsiVoid("apa pun");
        selamatPagi("Emak");
        selamatPagi("Abah");
        
    }
    
    private static void selamatPagi(String nama){
        System.out.println("Selamat pagi " + nama);
    }
    
    // fungsi atau method tanpa return
    private static void fungsiVoid(String input){
        System.out.println(input);
    }
    
    // fungsi atau method dengan return
    // sehingga menggunakan return untuk mengembalikan
    // nilainya
    private static float simple(){
        return 10.0f;
    }
    
}
