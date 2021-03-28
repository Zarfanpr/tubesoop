package Hiji;

class KartuAngka extends Kartu {
    private int Angka;

    KartuAngka(String Warna, String Tipe, int Angka){
        super(Warna,Tipe);
        this.Angka = Angka;
    }

    int GetAngka(){
        return this.Angka;
    }

    void SetAngka(int Angka){
        this.Angka = Angka;
    }

    @Override
    void PlayEffect() {
        
    }
}
