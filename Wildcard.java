package Hiji;

import java.util.Scanner;

class Wildcard extends Kartu{
    Wildcard(String Tipe){
        super(Tipe);
    }

    void PlayEffect(Player P){
        Scanner Scan = new Scanner(System.in);
        System.out.print("Masukkan warna yang diinginkan selanjutnya: ");
        String SetterWarna = Scan.next();
        P.SetColorOnPlay(SetterWarna);
    }
}