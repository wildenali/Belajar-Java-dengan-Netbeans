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
        
        int hasilInteger;
        hasilInteger = tambah(4, 5);
        printAngka(hasilInteger);
        
        float hasilFloat;
        hasilFloat = tambah(4.5f, 4);
        printAngka(hasilFloat);
        
        hasilFloat = tambah(4, 4.6f);
        printAngka(hasilFloat);
        
        hasilInteger = tambah(41, 51, 33);
        printAngka(hasilInteger);
        
        printAngka(10);
        printAngka(10.44f);
        printAngka(16.2d);
        printAngka(16);
        
        
    }
    
    private static int tambah(int angkaInt1, int angkaInt2, int angkaInt3){
        return angkaInt1 + angkaInt2 + angkaInt3;
    }
    
    private static float tambah(int angkaInt2, float angkaFloat1){
        return angkaFloat1 + angkaInt2;
    }
    
    private static float tambah(float angkaFloat1, int angkaInt2){
        return angkaFloat1 + angkaInt2;
    }
    
    private static int tambah(int angkaInt1, int angkaInt2){
        return angkaInt1 + angkaInt2;
    }
    
    private static void printAngka(double angkaDouble){
        System.out.println("Angka ini adalah double dengan nilai = " + angkaDouble);
    }
    
    private static void printAngka(float angkaFloat){
        System.out.println("Angka ini adalah float dengan nilai = " + angkaFloat);
    }
    
    private static void printAngka(int angkaInt){
        System.out.println("Angka ini adalah integer dengan nilai = " + angkaInt);
    }
}
