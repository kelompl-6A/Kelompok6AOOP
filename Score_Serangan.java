public class Score_Serangan extends Maps {
    public static void battle() {
        Input_Serangan pl = new Input_Serangan();
        pl.indonesiaTurn();
        pl.malaysiaTurn();

        Maps_Hasil_serangan map = new Maps_Hasil_serangan();
        // map.printMaps();

        System.out.println();
        System.out.println("Score Perolehan Sementara");
        System.out.println("Kapal indonesia: " + jum_kapal_indonesia + " | Kapal malaysia: " + jum_kapal_malaysia);
        System.out.println();
    }
}
