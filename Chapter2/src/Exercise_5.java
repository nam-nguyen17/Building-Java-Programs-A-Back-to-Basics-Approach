public class Exercise_5 {

    //establishing class constants
    public static final int SIZE = 5;
    public static final int WIDTH = SIZE * 5;

    public static void main(String[] args) {

        //perform this loop for as many times as there are stairs
        for (int i = 1; i <= SIZE; i++) {

            //calculating number of spaces before the top line of the stair
            for (int x = 1; x <= (WIDTH + (i * (-5))); x++) {
                System.out.print(" ");
            }

            //printing top line of the stair
            head();

            //calculating the number of spaces after the top line of the stair
            for (int y = 1; y <= ((i - 1) * 5); y++) {
                System.out.print(" ");
            }
            System.out.println("*");


            for (int x = 1; x <= (WIDTH + (i * (-5))); x++) {
                System.out.print(" ");
            }

            //printing middle line of the stair
            body();
//
            for (int y = 1; y <= (i * 5); y++) {
                System.out.print(" ");
            }
            System.out.println("*");

            for (int x = 1; x <= (WIDTH + (i * (-5))); x++) {
                System.out.print(" ");
            }
            // printing the bottom line of the stair
            bottom();

            for (int y = 1; y <= (i * 5); y++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // calculate the bottom of the stair
        for (int x = 1; x <= WIDTH + 7; x++) {
            System.out.print("*");
        }
    }

    public static void head() {
        System.out.print("  o  ******");
    }

    public static void body() {
        System.out.print(" /|\\ *");
    }

    public static void bottom() {
        System.out.print(" / \\ *");
    }
}