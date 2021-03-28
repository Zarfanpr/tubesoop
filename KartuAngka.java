package Hiji;

class KartuAngka extends Kartu {
    private int Angka;

    KartuAngka(String Warna, int Angka){
        super(Warna,"Angka");
        this.Angka = Angka;
    }

    int GetAngka(){
        return this.Angka;
    }

    void SetAngka(int Angka){
        this.Angka = Angka;
    }

    @Override
    void PlayEffect(Player P) {
        P.SetColorOnPlay(this.getWarna());
        P.SetAngkaOnPlay(this.GetAngka());
        P.SetGiliran(P.GetGiliran() + P.GetStep());
    }
}
