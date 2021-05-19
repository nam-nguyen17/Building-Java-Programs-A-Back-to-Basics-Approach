public class Exercise_2 {
    public static void main(String[] args) {
        lines();
        upperPart();
        lines();
        lowerPart();
        lines();
    }

    public static void lines() {
        System.out.print("+");

        for (int i = 1; i <= 6; i++) {
            System.out.print("-");
        }

        System.out.print("+");
        System.out.println();
    }

    public static void upperPart() {
        for (int i = 1; i <= 2; i++) {


            for (int j = 0; j <= 2; j++) {
                System.out.print("|");


                for (int x = 1; x <= 2 - j; x++) {
                    System.out.print(" ");
                }
                System.out.print("^");

                for (int x = 0; x <= 2 * j - 1; x++) {
                    System.out.print(" ");
                }
                System.out.print("^");

                for (int x = 1; x <= 2 - j; x++) {
                    System.out.print(" ");
                }


                System.out.print("|");
                System.out.println();
            }
        }
    }

    public static void lowerPart() {
        for (int i = 1; i <= 2; i++) {


            for (int j = 2; j >= 0; j--) {
                System.out.print("|");


                for (int x = 2 - j; x >= 1; x--) {
                    System.out.print(" ");
                }
                System.out.print("^");

                for (int x = 2 * j - 1; x >= 0; x--) {
                    System.out.print(" ");
                }
                System.out.print("^");

                for (int x = 2 - j; x >= 1; x--) {
                    System.out.print(" ");
                }


                System.out.print("|");
                System.out.println();
            }
        }
    }

}
