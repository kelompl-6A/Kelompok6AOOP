public class Gameover extends Maps {
    public static void gameOver() {
        System.out.println("Score Akhir Perolehan Kedua Pihak!!");
        System.out.println("Kapal China : " + Maps.jum_ship_china + " | Kapal Amerika: " + Maps.jum_ship_amerika);
        if (Maps.jum_ship_china > 0 && Maps.jum_ship_amerika <= 0)
            System.out.println("China Memenangkan Pertempuran :)");
        else if (Maps.jum_ship_amerika > 0 && Maps.jum_ship_china <= 0)
            System.out.println("Amerika Memenangkan Pertempuran");
        System.out.println();
    }
}
