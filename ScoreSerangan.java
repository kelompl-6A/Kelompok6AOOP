public class ScoreSerangan extends Maps {
    public static void battle() {
        Input_serangan pl = new Input_serangan();
        pl.chinaTurn();
        pl.amerikaTurn();

        MapsHasilSerangan map = new MapsHasilSerangan();
        map.printMaps();

        System.out.println();
        System.out.println("Score Perolehan Sementara");
        System.out.println("Kapal China : " + Maps.jum_ship_china + " | Kapal Amerika: " + Maps.jum_ship_amerika);
        System.out.println();
    }
}
