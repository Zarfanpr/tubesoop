package Hiji;

abstract class Kartu{
    private String Warna = "Hitam";
    private String Tipe;
    
    Kartu(String Warna, String Tipe){
        this.Warna = Warna;
        this.Tipe = Tipe;
    }

    Kartu(String Tipe){
        this.Tipe = Tipe;
    }
    
    String getWarna(){
        return this.Warna;
    }

    String getTipe(){
        return this.Tipe;
    }

    void SetWarna(String Warna){
        this.Warna = Warna;
    }

    void SetTipe(String Tipe){
        this.Tipe = Tipe;
    }

    void PlayEffect(Player P);
}