public class Main {
    private static void DrawXYZ (int n) {
//        * * * * *
        int test = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                System.out.print("* ");
                test = test + 1;
                if (test % 3 == 0) {
                    System.out.print("X ");
                } else if (test % 2 != 0) {
                    System.out.print("Y ");
                } else if (test % 2 == 0) {
                    System.out.print("Z ");
                }
            }
            System.out.println();

        }
    }
    public static void main (String[]args){
        DrawXYZ(3);
                /*
                Y Z X
                Z Y X
                Y Z X
                */
        DrawXYZ(5);
                /*
                Y Z X Z Y
                X Y Z X Z
                Y X Y Z X
                Z Y X Y Z
                X Z Y X Y
                */
        DrawXYZ(1);
        //Y

    }

}

