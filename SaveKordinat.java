import java.util.*;

public class SaveKordinat extends Maps {
    public static void saveKordinatC() {
        Scanner input = new Scanner(System.in);
        Maps.jum_ship_china = 5;
        for (int i = 1; i <= Maps.jum_ship_china;) {
            System.out.println("Kapal Cina " + i + " Tempatkan kordinat");
            System.out.print("input posisi x = ");
            int x = input.nextInt();
            System.out.print("input posisi y = ");
            int y = input.nextInt();
            System.out.println();
            if ((x >= 0 && x < shipX) && (x >= 0 && y < shipY) && (ship[x][y] == ' ')) {
                ship[x][y] = 'x';
                i++;
            } else if ((x >= 0 && x < shipX) &&
                    (x >= 0 && y < shipY) && ship[x][y] == 'x')
                System.out.println("Lokasi ini sudah diisi");
            else if ((x < 0 || y >= shipX) ||
                    (y < 0 || y >= shipY))
                System.out.println("Kamu tidak bisa menempat lokasi/kordinat diatas " + shipX
                        + " dan " + shipY + "dihitung dari 0-4");
        }
    }

    public static void saveKordinatA() {
        Scanner input = new Scanner(System.in);
        Maps.jum_ship_amerika = 5;
        for (int i = 1; i <= Maps.jum_ship_amerika;) {
            System.out.println("Kapal Amerika " + i + " Tempatkan kordinat");
            System.out.print("input posisi x = ");
            int x = input.nextInt();
            System.out.print("input posisi y = ");
            int y = input.nextInt();
            System.out.println();
            if ((x >= 0 && x < shipX) && (x >= 0 && y < shipY) && (ship[x][y] == ' ')) {
                ship[x][y] = 'y';
                i++;
            } else if ((x >= 0 && x < shipX) &&
                    (x >= 0 && y < shipY) && ship[x][y] == 'y')
                System.out.println("Lokasi ini sudah diisi");
            else if ((x < 0 || y >= shipX) ||
                    (y < 0 || y >= shipY))
                System.out.println("Kamu tidak bisa menempat lokasi/kordinat diatas " + shipX
                        + " dan " + shipY + "dihitung dari 0-4");
        }
    }
}
