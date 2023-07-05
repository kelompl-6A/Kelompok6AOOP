import java.util.Scanner;

public class Input_Serangan extends Maps {
    public static void indonesiaTurn() {
        System.out.println("Masukan Titik Serangan!!");
        int x = -1, y = -1;
        while ((x < 0 || x >= kapalX) || (y < 0 || y >= kapalY)) {
            Scanner input = new Scanner(System.in);
            System.out.println("Masukan Titik Serangan indonesia!!");
            System.out.print("input posisi x : ");
            x = input.nextInt();
            System.out.print("input posisi y : ");
            y = input.nextInt();
            if ((x >= 0 && x < kapalX) && (y >= 0 && y < kapalY)) {
                if (kapal[x][y] == 'y') {
                    System.out.println("Bagus, Kamu Mengenai Sasaran(1 Kapal malaysia Hancur)!!");
                    kapal[x][y] = '*';
                    --jum_kapal_malaysia;
                } else if (kapal[x][y] == 'x') {
                    System.out.println("Oh tidak, kamu menembak kapal kamu sendiri");
                    kapal[x][y] = '!';
                    --jum_kapal_indonesia;
                } else if (kapal[x][y] == ' ') {
                    System.out.println("Sorry, you missed");
                    kapal[x][y] = '-';
                }
            } else {
                System.out.println("Kamu tidak bisa menempatkan lokasi/kordinat di atas " + kapalX +
                        " dan " + kapalY + ", dihitung dari 0-4");
            }
           
        }
    }

    public static void malaysiaTurn() {
        System.out.println("Masukan Titik Serangan!!");
        int x = -1, y = -1;
        while ((x < 0 || x >= kapalX) || (y < 0 || y >= kapalY)) {
            Scanner input = new Scanner(System.in);
            System.out.println("Masukan Titik Serangan malaysia!!");
            System.out.print("input posisi x : ");
            x = input.nextInt();
            System.out.print("input posisi y : ");
            y = input.nextInt();
            if ((x >= 0 && x < kapalX) && (y >= 0 && y < kapalY)) {
                if (kapal[x][y] == 'x') {
                    System.out.println("Bagus, Kamu Mengenai Sasaran(1 Kapal indonesia Hancur)!!");
                    kapal[x][y] = '*';
                    --jum_kapal_indonesia;
                } else if (kapal[x][y] == 'y') {
                    System.out.println("Oh tidak, kamu menembak kapal kamu sendiri");
                    kapal[x][y] = '!';
                    --jum_kapal_malaysia;
                } else if (kapal[x][y] == ' ') {
                    System.out.println("Sorry, you missed");
                    kapal[x][y] = '-';
                }
            } else {
                System.out.println("Kamu tidak bisa menempatkan lokasi/kordinat di atas " + kapalX +
                        " dan " + kapalY + ", dihitung dari 0-4");
            }
            
        }
    }
}
