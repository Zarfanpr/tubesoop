package Hiji;

import java.util.Scanner;

class KartuDraw4 extends Kartu{
    private int Draw;

    KartuDraw4(String Tipe){
        super(Tipe);
        this.Draw = 4;
    }
    int getDrawEffect(){
        return this.Draw;
    }

    void SetEfek(int Draw){
        this.Draw = Draw;
    }

    void PlayEffect(Player P, Player nextPlayer){
        Scanner Scan = new Scanner(System.in);
        System.out.print("Masukkan warna yang diinginkan selanjutnya: ");
        String SetterWarna = Scan.next();
        P.SetColorOnPlay(SetterWarna);


        nextPlayer.Draw();
        nextPlayer.Draw();
        nextPlayer.Draw();
        nextPlayer.Draw();
    }
}
