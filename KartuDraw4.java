//package Hiji;

import java.util.Scanner;

public class KartuDraw4 extends Kartu{
    private int Draw;

    KartuDraw4(){
        super("Draw4");
        this.Draw = 4;
    }
    int getDrawEffect(){
        return this.Draw;
    }

    void SetEfek(int Draw){
        this.Draw = Draw;
    }

    void PlayEffect(Player P){
        Scanner Scan = new Scanner(System.in);
        System.out.print("Masukkan warna yang diinginkan selanjutnya: ");
        String SetterWarna = Scan.next();
        P.SetColorOnPlay(SetterWarna);
        Scan.close();
    }
}
