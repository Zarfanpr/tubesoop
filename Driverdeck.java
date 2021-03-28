import java.lang.System;
import java.util.Scanner;

public class Driverdeck {
    public static void main(String[] args) {

        Deck dek = new Deck(7);
        System.out.println(dek.kartuakhir);
        System.out.println(dek.kartuawal);
        dek.makeDeck();
        System.out.println(dek.arr[4]);
        System.out.println(dek.KeluarinKartu());
        System.out.println(dek.KeluarinKartu());
        System.out.println(dek.KeluarinKartu());

        // dek.Tarobaru(91);



        // int[] arr; 
        // arr = new int[10];
        // arr[0] = 3;
        // System.out.print(arr[0]);
    
    

        
        // print(arr[0]);
        // arr[99] = "there"; 


        
    }
}