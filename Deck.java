public class Deck {
    static int kartuawal;
    static int kartuakhir;
    public int[] arr; 
    // arr = new int[jumlahkartu];
    // arr[0] = 3;

    public Deck (int kartuakhir){
        this.kartuakhir = kartuakhir;
        this.kartuawal = 0;
        // this.arr = new int[jumlahkartu];
    }

    public void KeluarinKartu(int idkartu){
        this.kartuawal++;

    } 
    public void TaroBaru(int idkartu){
        this.kartuakhir++;
    } 
// halo
}
