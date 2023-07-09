import java.util.Scanner;
/* Kelompok 6A PBO
=======
import java.util.Scanner;
/* Kelompok 6A PBO demo
>>>>>>> c430cfd58d0c4711641054f6b79e7284e9b4a569
Riangdana Jurmasari 60900121012
Safaruddin 60900121046
Yunita Amalia 60900121018
Ananda Intan Pratiwi 60900121005
Faisal Faiz 60900121004 */

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
          SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MapsGUII().setVisible(true);
            }
        });
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

        // Peta setelah menempatkan koordinat kapal
        Maps_Hasil_serangan.printMaps();

        // Serangan Indonesia
        Input_Serangan.indonesiaTurn();
        // Peta setelah serangan Indonesia
        Maps_Hasil_serangan.printMaps();

        // Serangan Malaysia
        Input_Serangan.malaysiaTurn();
        // Peta setelah serangan Malaysia
        Maps_Hasil_serangan.printMaps();
    }
}


