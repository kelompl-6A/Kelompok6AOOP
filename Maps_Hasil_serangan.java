public class Maps_Hasil_serangan extends Maps{
    public static void printMaps(){
        System.out.println();

        System.out.print("  ");
        for(int i = 0; i < kapalY; i++)
            System.out.print(i);
        System.out.println();

        for(int x = 0; x < kapal.length; x++) {
            System.out.print(x + "|");

            for (int y = 0; y < kapal[x].length; y++){
                System.out.print(kapal[x][y]);
            }

            System.out.println("|" + x);
        }
        System.out.print("  ");
        for(int i = 0; i < kapalY; i++)
            System.out.print(i);
        System.out.println();
    }
}

