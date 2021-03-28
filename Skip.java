package Hiji;

class Skip extends Kartu {
    Skip(String Warna, String Tipe){
        super(Warna,Tipe);
    }

    void PlayEffect(Player P, Player nextPlayer){
        P.SetColorOnPlay(this.getWarna());
		get.nextPlayer();
		get.nextPlayer();
    }
}