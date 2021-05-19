public class Exercise_3 {
    public static void main(String[] args) {
        lines();
        upperPart();
        lowerPart();
        lines();
        lowerPart();
        upperPart();
        lines();
    }


    public static void lines() {

        System.out.print("+");
        for (int i = 1; i <= 9; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
    }

    public static void upperPart() {

        for (int i = 0; i <= 3; i++) {
            System.out.print("|");


            for(int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i - 1; j++) {
                System.out.print("/");
            }
            System.out.print("*");

            for (int j = 0; j <= i - 1; j++) {
                System.out.print("\\");
            }

            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }


    public static void lowerPart() {
        for (int i = 3; i >= 0; i--) {
            System.out.print("|");


            for (int j = 4 - i; j >= 1; j--) {
                System.out.print(" ");
            }

            for (int j = i - 1; j >= 0; j--) {
                System.out.print("\\");
            }
            System.out.print("*");

            for (int j = i - 1; j >= 0; j--) {
                System.out.print("/");
            }

            for (int j = 4 - i; j >= 1; j--) {
                System.out.print(" ");
            }

            System.out.print("|");
            System.out.println();
        }
    }

}
