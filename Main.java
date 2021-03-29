import java.lang.System;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //Player pemain = new Player();
        System.out.print("Masukkan jumlah pemain: ");
        Scanner input = new Scanner(System.in);
        int jumlahpemain = input.nextInt();

        //looping input kalo pemain ga 2-6
        while (jumlahpemain<2||jumlahpemain>6){
            System.out.println("Jumlah pemain hanya bisa 2-6 orang");
            System.out.print("Masukkan jumlah pemain: ");
            jumlahpemain = input.nextInt();
        }
        System.out.println(jumlahpemain);
        String[] listplayer = new String[jumlahpemain];

        //masukin uname player
        for (int i = 0 ; i <jumlahpemain; i++){
            System.out.print("Username Pemain "+(i+1)+": ");
            listplayer[i]= input.next();
        }

    
        for(String b:listplayer){
            System.out.println(b);
        }
    }
}