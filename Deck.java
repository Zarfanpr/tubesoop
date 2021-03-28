public class Deck { //masih bentuk integer
    static int kartuawal;
    static int kartuakhir;
    public int[] arr; 
    // arr = new int[jumlahkartu];
    // arr[0] = 3;

    public Deck (int kartuakhir){
        Deck.kartuakhir = kartuakhir-1;
        Deck.kartuawal = 0;
        this.arr = new int[kartuakhir];
        // this.arr = new int[jumlahkartu];
    }

    public void makeDeck(){
    int jumlahkartu = kartuakhir - kartuawal;
        for (int i=0; i<jumlahkartu; i++){
            arr[i] = i+1;
        }
    }

    public int KeluarinKartu(){
        int kartukeluar = arr[kartuawal];
        kartuawal++;
        return (kartukeluar);
    } 
    public void TaroBaru(int idkartu){
        setkartuakhir(getkartuakhir()+1);
        arr[kartuakhir] = idkartu;
    } 

    public static int getkartuakhir(){
        return kartuakhir;
    }

    public void setkartuakhir(int kartuakhir){
        Deck.kartuakhir = kartuakhir;
    }

    public static int getkartuawal(){
        return kartuawal;
    }

    public void setkartuawal(int kartuawal){
        Deck.kartuawal = kartuawal;
    }

}
