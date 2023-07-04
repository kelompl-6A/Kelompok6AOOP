import java.util.Scanner;
/* Kelompok 6A PBO demo
Riangdana Jurmasari 60900121012
Safaruddin 60900121046
Yunita Amalia 60900121018
Ananda Intan Pratiwi 60900121005
Faisal Faiz 60900121004 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Game Battlekapal");
        Maps map = new Maps();
        map.initializeMaps();
        // Memanggil input kapal Indonesia
        SaveKordinat save = new SaveKordinat();
        save.saveKordinatC();
        // Memanggil input kapal Malaysia
        save.saveKordinatA();
        Score_Serangan battle = new Score_Serangan();
        do {
            battle.battle();
        } while (Maps.jum_kapal_indonesia != 0 && Maps.jum_kapal_malaysia != 0);
    }
}

