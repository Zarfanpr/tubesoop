package Hiji;

class Player{

    static String ColorOnPlay;
    static int Giliran;
    static int Step = 1;
    static int AngkaOnPlay;


    private List<Kartu> Hand = new ArrayList<Kartu>();
    int JumlahKartu;
    int Urutan;

    Player();

    void SetColorOnPlay(String Warna){
        this.ColorOnPlay = Warna;
    }

    void SetAngkaOnPlay(int Angka){
        this.AngkaOnPlay = Angka;
    }

    int GetGiliran(){
        return this.Giliran;
    }

    void SetGiliran(int Giliran){
        this.Giliran = Giliran;
    }

    int GetStep(){
        return this.Step;
    }

    void Draw(Kartu kartu){
        list.add(kartu);
    }

    void isjumlahkartuHiji(){

    }


}