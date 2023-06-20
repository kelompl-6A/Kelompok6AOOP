public class MapsHasilSerangan extends Maps {
    public static void printMaps() {
        System.out.println();

        System.out.print("  ");
        for (int i = 0; i < shipY; i++)
            System.out.print(i);
        System.out.println();

        for (int x = 0; x < ship.length; x++) {
            System.out.print(x + "|");

            for (int y = 0; y < ship[x].length; y++) {
                System.out.print(ship[x][y]);
            }

            System.out.println("|" + x);
        }
        System.out.print("  ");
        for (int i = 0; i < shipY; i++)
            System.out.print(i);
        System.out.println();
    }
}
