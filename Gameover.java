public class Gameover extends Maps{
//Ini adalah deklarasi kelas Gameover yang merupakan turunan dari kelas Maps. 
//berarti kelas Gameover mewarisi semua properti dan metode dari kelas Maps.
    public static void gameOver(){
//Ini adalah deklarasi metode gameOver. Metode ini bersifat statis , yang berarti dapat dipanggil langsung tanpa membuat objek dari kelas Gameover terlebih dahulu.
        System.out.println("Score Akhir Perolehan Kedua Pihak!!");
// Ini adalah pernyataan yang mencetak teks .
        System.out.println("Kapal indonesia : " + Maps.jum_kapal_indonesia + " | Kapal malaysia: " + Maps.jum_kapal_malaysia);
//Ini adalah pernyataan yang mencetak teks  diikuti dengan nilai variabel  dari kelas , 
//kemudian teks diikuti dengan nilai variabel  dari kelas Maps. Ini mencetak jumlah kapal Indonesia dan Malaysia ke output konsol.
        if(Maps.jum_kapal_indonesia > 0 && Maps.jum_kapal_malaysia <= 0)
//Ini adalah blok kondisional if yang melakukan pengecekan apakah jumlah kapal Indonesia lebih besar dari 0 dan jumlah kapal Malaysia kurang dari atau sama dengan 0.
            System.out.println("indonesia Memenangkan Pertempuran :)");
//Jika kondisi di atas terpenuhi , pernyataan ini akan mencetak teks  ke output konsol.
        else if(Maps.jum_kapal_malaysia > 0 && Maps.jum_kapal_indonesia <= 0)
// Ini adalah blok kondisional else if yang melakukan pengecekan tambahan. 
//Jika kondisi pertama tidak terpenuhi, maka kondisi ini akan diperiksa. 
//Kondisi ini memeriksa apakah jumlah kapal Malaysia lebih besar dari 0 dan jumlah kapal Indonesia kurang dari atau sama dengan 0.
            System.out.println("malaysia Memenangkan Pertempuran");
//Jika kondisi di atas terpenuhi , pernyataan ini akan mencetak teks "Malaysia Memenangkan Pertempuran" ke output konsol.
        System.out.println(); 
// Ini adalah pernyataan kosong yang mencetak baris kosong ke output konsol.
    }
}
