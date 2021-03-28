package Hiji;

class Reverse extends Kartu{
	public enum Directions {FORWARDS,BACKWARDS};
	
    Reverse(String Warna, String Tipe){
        super(Warna,Tipe);
    }

    void PlayEffect(Player P, Player nextPlayer){
        P.SetColorOnPlay(this.getWarna());
		if (Directions == Directions.FORWARDS) {
			Directions = Directions.BACKWARDS;
		}
		
		else {
			Directions = Directions.BACKWARDS;
		}
		get.nextPlayer();
    }
}