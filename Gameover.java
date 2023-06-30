public class Gameover extends Maps{
    public static void gameOver(){
        System.out.println("Score Akhir Perolehan Kedua Pihak!!");
        System.out.println("Kapal indonesia : " + Maps.jum_kapal_indonesia + " | Kapal malaysia: " + Maps.jum_kapal_malaysia);
        if(Maps.jum_kapal_indonesia > 0 && Maps.jum_kapal_malaysia <= 0)
            System.out.println("indonesia Memenangkan Pertempuran :)");
        else if(Maps.jum_kapal_malaysia > 0 && Maps.jum_kapal_indonesia <= 0)
            System.out.println("malaysia Memenangkan Pertempuran");
        System.out.println(); 
    }
}
