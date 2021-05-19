public class Exercise_6 {
    // establishing the class constant
    public static final int SIZE = 3;
    public static final int WIDTH = SIZE * 2;

    public static void main(String[] args) {
        head();
        lines();
        body1();
        body2();
        lines();
        body2();
        body1();
        lines();
        head();
    }

    public static void lines() {
        System.out.print("+");
        for (int i = 1; i <= WIDTH; i++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }

    public static void head() {
        for (int i = 0; i <= WIDTH - 2; i++) {
            for (int x = 1; x <= (WIDTH - 1) - i; x++) {
                System.out.print(" ");
            }
            for (int y = WIDTH - 1; y >= (WIDTH - 1) - i; y--) {
                System.out.print("/");
            }
            for (int x = 1; x <= SIZE - 1; x++) {
                System.out.print("*");
            }
            for (int y = WIDTH - 1; y >= (WIDTH - 1) - i; y--) {
                System.out.print("\\");
            }
            for (int x = 1; x <= (WIDTH - 1) - i; x++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void body1() {

        for (int j = 0; j <= SIZE - 1; j++) {
            System.out.print("|");

            for (int x = 2; x <= SIZE - j; x++) {
                System.out.print("*");
            }

            for (int x = SIZE; x >= SIZE - j; x--) {
                System.out.print("/\\");
            }

            for (int x = SIZE; x <= (SIZE - j) * 2; x++) {
                System.out.print(".");
            }

            for (int x = SIZE; x >= SIZE - j; x--) {
                System.out.print("/\\");
            }

            for (int x = 2; x <= SIZE - j; x++) {
                System.out.print("*");
            }

            System.out.print("|");
            System.out.println();
        }
    }

    public static void body2() {
        for (int i = 0; i <= SIZE - 1; i++) {
            System.out.print("|");

            for (int y = WIDTH; y >= (WIDTH - i) + 1; y--) {
                System.out.print("*");
            }

            for (int x = SIZE; x >= i + 1; x--) {
                System.out.print("\\/");
            }

            for (int x = 1; x <= i * 2; x++) {
                System.out.print(".");
            }

            for (int x = SIZE; x >= i + 1; x--) {
                System.out.print("\\/");
            }

            for (int y = WIDTH; y >= (WIDTH - i) + 1; y--) {
                System.out.print("*");
            }
            System.out.print("|");

            System.out.println();

        }
    }


}
