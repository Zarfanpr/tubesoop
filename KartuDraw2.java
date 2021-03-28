package Hiji;

class KartuDraw2 extends Kartu{
    private int Draw;

    KartuDraw2(String Warna, String Tipe){
        super(Warna,Tipe);
        this.Draw = 2;
    }

    int getDrawEffect(){
        return this.Draw;
    }

    void SetEfek(int Draw){
        this.Draw = Draw;
    }

    void PlayEffect(Player P, Player nextPlayer){
        P.SetColorOnPlay(this.getWarna());
        P.SetGiliran(P.GetGiliran() + P.GetStep());
        nextPlayer.Draw();
        nextPlayer.Draw();
    }
}
