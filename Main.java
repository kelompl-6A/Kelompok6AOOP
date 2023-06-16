import java.util.Scanner;
/**
 *
 * Kelompok 6A PBO
Riangdana Jurmasari 60900121012
Safaruddin 60900121046
Yunita Amalia 60900121018
Ananda Intan Pratiwi 60900121005
Faisal Faiz 60900121004
 */
public class Main {
    
    
    public static void main(String[] args){
        System.out.println("Game Battleship");
        Maps map = new Maps();
        map.Maps();
        //memanggil input kapal cina
        SaveKordinat save = new SaveKordinat();
        save.saveKordinatC();
        //memanggil input kapal amerika
        save.saveKordinatA();
        Score_Serangan battle = new Score_Serangan();
        do{
            battle.battle();
        }while(Maps.jum_ship_china !=0 && Maps.jum_ship_amerika !=0);

   
    }
    
    
   
}