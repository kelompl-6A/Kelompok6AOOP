import java.util.*;

public class SaveKordinat extends Maps {
    public static void saveKordinatC() {
        Scanner input = new Scanner(System.in);
        jum_kapal_indonesia = 5;
        for (int i = 1; i <= jum_kapal_indonesia; ) {
            System.out.println("Kapal indonesia " + i + " Tempatkan kordinat");
            System.out.print("input posisi x = ");
            int x = input.nextInt();
            System.out.print("input posisi y = ");
            int y = input.nextInt();
            System.out.println();

            if ((x >= 0 && x < kapalX) && (y >= 0 && y < kapalY) && (kapal[x][y] == ' ')) {
                kapal[x][y] = 'x';
                i++;
            } else if ((x >= 0 && x < kapalX) && (y >= 0 && y < kapalY) && kapal[x][y] == 'x') {
                System.out.println("Lokasi ini sudah diisi");
            } else if ((x < 0 || x >= kapalX) || (y < 0 || y >= kapalY)) {
                System.out.println("Kamu tidak bisa menempatkan lokasi/kordinat di atas " + kapalX +
                        " dan " + kapalY + " dihitung dari 0-" + (kapalX - 1));
            }
        }
    }

    public static void saveKordinatA() {
        Scanner input = new Scanner(System.in);
        jum_kapal_malaysia = 5;
        for (int i = 1; i <= jum_kapal_malaysia; ) {
            System.out.println("Kapal Malaysia " + i + " Tempatkan kordinat");
            System.out.print("input posisi x = ");
            int x = input.nextInt();
            System.out.print("input posisi y = ");
            int y = input.nextInt();
            System.out.println();

            if ((x >= 0 && x < kapalX) && (y >= 0 && y < kapalY) && (kapal[x][y] == ' ')) {
                kapal[x][y] = 'y';
                i++;
            } else if ((x >= 0 && x < kapalX) && (y >= 0 && y < kapalY) && kapal[x][y] == 'y') {
                System.out.println("Lokasi ini sudah diisi");
            } else if ((x < 0 || x >= kapalX) || (y < 0 || y >= kapalY)) {
                System.out.println("Kamu tidak bisa menempatkan lokasi/kordinat di atas " + kapalX +
                        " dan " + kapalY + " dihitung dari 0-" + (kapalX - 1));
            }
        }
    }
}
