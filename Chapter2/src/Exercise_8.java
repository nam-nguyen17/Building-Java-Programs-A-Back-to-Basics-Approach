public class Exercise_8 {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        line();
        body();
        front();
    }

    public static void line() {
        for (int x = 0; x <= SIZE; x++) {
            System.out.print(" ");
        }
        System.out.print("+");
        for (int i = 0; i <= SIZE * 3 - 1; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void body() {
        for (int i = 0; i <= SIZE - 1; i++) {
            for (int x = SIZE; x >= i + 1; x--) {
                System.out.print(" ");
            }
            System.out.print("/");

            for (int x = SIZE * 3 - 4; x >= i * 3; x--) {
                System.out.print(" ");
            }
            System.out.print("___/");

            for (int x = SIZE - i; x <= SIZE - 1; x++) {
                System.out.print("__/");
            }

            for (int x = SIZE - i; x <= SIZE - 1; x++) {
                System.out.print("/");
            }

            System.out.println();
        }
    }

    public static void front() {
        System.out.print("+");
        for (int i = 1; i <= SIZE * 3; i++) {
            System.out.print("-");
        }
        System.out.print("+");

        for (int i = 1; i <= SIZE; i++) {
            System.out.print("/");
        }
        System.out.println();

        for (int i = 1; i <= SIZE / 2; i++) {
            System.out.print("|");

            for (int x = 1; x < SIZE / 2; x++) {
                System.out.print(" ");
            }
            System.out.print("Building Java Programs");

            for (int x = 1; x < SIZE / 2; x++) {
                System.out.print(" ");
            }
            System.out.print("|");

            for (int y = SIZE + 1; y >= i * 2; y--) {
                System.out.print("/");
            }

            System.out.println();
        }

        System.out.print("+");
        for (int k = 1; k <= SIZE * 3; k++) {
            System.out.print("-");
        }
        System.out.print("+");

        System.out.println();
    }
}
