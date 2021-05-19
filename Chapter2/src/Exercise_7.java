public class Exercise_7 {

    public static final int SIZE = 4;
    public static final int WIDTH = SIZE * 2;

    public static void main(String[] args) {
        row();
        triangle1();
        line();
        triangle2();
        row();
        dRow();
        triangle1();
        line();
    }

    public static void line() {
        System.out.print("|");
        for (int i = 1; i <= SIZE * 6; i++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }

    public static void triangle1() {
        for (int i = 0; i <= SIZE - 1; i++) {
            for (int x = WIDTH; x >= i * 3; x--) {
                System.out.print(" ");
            }
            System.out.print("__/");

            for (int x = 1; x <= (i * 3); x++) {
                System.out.print(":");
            }

            for (int x = 1; x <= SIZE - 2; x++) {
                System.out.print("|");
            }

            for (int x = 1; x <= (i * 2) + i; x++) {
                System.out.print(":");
            }
            System.out.print("\\__");

            System.out.println();
        }
    }

    public static void triangle2() {
        for (int i = 0; i <= SIZE - 1; i++) {
            for (int x = 1; x <= (i * 2) ; x++) {
                System.out.print(" ");
            }
            System.out.print("\\_/");

            for (int x = WIDTH + 1; x >= i * 2; x--) {
                System.out.print("\\/");
            }

            for (int x = 1; x <= (i * 2) ; x++) {
                System.out.print("");
            }
            System.out.print("\\_/");

            System.out.println();
        }
    }

    public static void row() {
        for (int i = 0; i <= SIZE - 1; i++) {
            for (int x = 0; x <= SIZE * 3 - 1; x++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    public static void dRow() {

        for (int i = 0; i <= SIZE * 4 - 1; i++) {
            for (int x = 0; x <= SIZE * 2; x++) {
                System.out.print(" ");
            }
            System.out.println("|%%||%%|");
        }
    }
}

