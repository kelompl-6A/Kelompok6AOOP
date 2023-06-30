public class Maps {

    public static int kapalX = 10;
    public static int kapalY = 10;
    public static int jum_kapal_indonesia;
    public static int jum_kapal_malaysia;
    public static int[][] miss = new int[kapalX][kapalY];
    public static char[][] kapal = new char[kapalX][kapalY];

    public static void initializeMaps() {
        System.out.print("  ");
        for (int i = 1; i < kapalY; i++)
            System.out.print(i);
        System.out.println();

        for (int i = 1; i < kapal.length; i++) {
            for (int j = 1; j < kapal[i].length; j++) {
                kapal[i][j] = ' ';
                if (j == 1)
                    System.out.print(i + "|" + kapal[i][j]);
                else if (j == kapal[i].length - 1)
                    System.out.print(kapal[i][j] + "|" + i);
                else
                    System.out.print(kapal[i][j]);
            }
            System.out.println();
        }

        System.out.print("  ");
        for (int i = 1; i < kapalY; i++)
            System.out.print(i);
        System.out.println();
    }
}
