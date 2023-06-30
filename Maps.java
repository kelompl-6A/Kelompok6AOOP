public class Maps {

    public static int shipX = 10;
    public static int shipY = 10;
    public static int jum_ship_china;
    public static int jum_ship_amerika;
    public static int[][] miss = new int[shipX][shipY];
    public static char[][] ship = new char[shipX][shipY];

    public static void Maps() {
        System.out.print("  ");
        for (int i = 1; i < shipY; i++)
            System.out.print(i);
        System.out.println();

        for (int i = 1; i < ship.length; i++) {
            for (int j = 1; j < ship[i].length; j++) {
                ship[i][j] = ' ';
                if (j == 1)
                    System.out.print(i + "|" + ship[i][j]);
                else if (j == ship[i].length - 1)
                    System.out.print(ship[i][j] + "|" + i);
                else
                    System.out.print(ship[i][j]);
            }
            System.out.println();
        }

        System.out.print("  ");
        for (int i = 1; i < shipY; i++)
            System.out.print(i);
        System.out.println();

    }
}
