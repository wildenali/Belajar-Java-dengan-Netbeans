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
        
        // Operator Logika --> AND, OR, XOR, Negasi
        
        boolean a,b,c;
        
        // 1. Operator Logika AND (&&)
        System.out.println("========== Operator AND (&&) =========");
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        System.out.println();
        
        
        // 2. Operator Logika OR (||)
        System.out.println("========== Operator OR (||) =========");
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        System.out.println();
        
        
        // 3. Operator Logika XOR (^) Exlusive OR
        System.out.println("========== Operator XOR (^) Exlusive OR =========");
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        System.out.println();
        
        // 3. Operator Logika BOT (^) Negasi atau flipping
        System.out.println("========== Operator Negasi (!) =========");
        a = true;
        c = !a;
        System.out.println(a + " Negasi menjadi = " + c);
        a = false;
        c = !a;
        System.out.println(a + " Negasi menjadi = " + c);
        System.out.println();
        
    }
    
}
