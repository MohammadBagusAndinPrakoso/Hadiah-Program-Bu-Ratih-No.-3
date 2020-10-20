/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiahprogram_no.pkg3;

/**
 *
 * @author MOKLET1
 */
import java.util.Scanner;
public class HadiahProgram_No3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[]suhu = {"X", "Celsius --> Fahrenheit", "Celsius --> Kelvin", "Celsius --> Reamour"};
        
        System.out.println("Konversi Suhu");
        
        for (int i = 1; i < suhu.length; i++){
            System.out.println(i+ ". " +suhu[i]);
        }
        
        System.out.println();
        System.out.print("Pilih Konversi Suhu : ");
        
        int pilihan = input.nextInt();
        
        System.out.println("Konversi yang dipilih : "+suhu[pilihan]);
        System.out.println();
        
        double c, f, k, r, hasil;
        
        switch(pilihan){
            case 1:
                System.out.println("Celsius --> Fahrenheit");
                System.out.print("Masukkan suhu Celsius : ");
                c = input.nextInt();
        
                hasil = (c * 9/5) + 32;
                System.out.println("Suhu Fahrenheit : "+hasil+ " derajat");
                break;
            
            case 2:
                System.out.println("Celsius --> Kelvin");
                System.out.print("Masukkan suhu Celsius : ");
                c = input.nextInt();
        
                hasil = c + 273;
                System.out.println("Suhu Kelvin : "+hasil+ " derajat");
                break;
            
            case 3:
                System.out.println("Celsius --> Reamour");
                System.out.print("Masukkan suhu Celsius : ");
                c = input.nextInt();
        
                hasil = c * 4/5;
                System.out.println("Suhu Reamour : "+hasil+ " derajat");
                break;
            
            default:
        }
        
    }
    
}
