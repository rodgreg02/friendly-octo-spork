import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1)left side\n2)left side upsidedown\n3)twosided\n4)twosided upsidedown\n0) quit");
        Scanner input = new Scanner(System.in);
        int rows = 10;
        boolean quit = false;
        while (!quit) {
            switch (input.nextInt()) {
                case 1:
                    String string = "*";
                    for (int i = 0; i < rows; i++) {
                        System.out.println(string);
                        string = string + "*";
                    }
                    break;
                case 2:
                    String string1 = "**********";
                    for (int i = rows; i > 0; i--) {
                        System.out.println(string1);
                        string1 = string1.substring(1);
                    }
                    break;
                case 3:
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= rows - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("*");
                        }
                        for (int l = 1; l < i; l++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = rows; i >= 1; i--) {
                        for (int j = 1; j <= rows - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i * 2 - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Ta quieto pá");
                    break;
            }
        }
    }
}