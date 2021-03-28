package Hiji;

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

    void PlayEffect(){
        
    }
}
