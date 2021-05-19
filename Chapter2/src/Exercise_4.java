public class Exercise_4 {
    public static void main(String[] args) {
        lines();
        upperPart();
        separator();
        lowerPart();
        lines();
    }

    public static void lines() {
        System.out.print("|");

        for (int i = 1; i <= 10; i++) {
            System.out.print("\"");
        }

        System.out.print("|");
        System.out.println();
    }

    public static void upperPart() {
        for (int i = 3; i >= 0; i--) {

            for (int j = 4 - i; j >= 1; j--) {
                System.out.print(" ");
            }
            System.out.print("\\");

            for (int j = 2 * i + 2; j >= 1; j--) {
                System.out.print(":");
            }
            System.out.print("/");

            System.out.println();
        }
    }

    public static void separator() {
        for (int i = 0; i <= 4; i++) {
            System.out.print(" ");
        }
        System.out.print("||");
        System.out.println();
    }

    public static void lowerPart() {
        for (int i = 0; i <= 3; i++) {

            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("/");

            for (int j = 1; j <= 2 * i + 2; j++) {
                System.out.print(":");
            }

            System.out.print("\\");
            System.out.println();

        }
    }
}
