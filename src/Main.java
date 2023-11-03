import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1)left side\n2)left side upsidedown\n3)twosided\n4)twosided upsidedown\n9)Multiplication table\n0) quit");
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
                case 5:
                    int counter1 = 20;
                    int counter2 = 1;
                    for (int i1 = 0; i1 < 10; i1++) {
                        System.out.println();
                        for (int i2 = 0; i2 < counter1; i2++) {
                            System.out.print(" ");
                        }
                        counter1 -= 2;
                        for (int i3 = 0; i3 < counter2; i3++) {
                            System.out.print("X ");
                        }
                        counter2++;
                    }
                    break;
                case 6:
                    int counter3 = 1;
                    int counter4 = 10;
                    for (int i1 = 0; i1 < 10; i1++) {
                        System.out.println();
                        for (int i2 = 0; i2 < counter3; i2++) {
                            System.out.print(" ");
                        }
                        counter3 += 2;
                        for (int i3 = 0; i3 < counter4; i3++) {
                            System.out.print("X ");
                        }
                        counter4--;
                    }
                    break;
                case 9:
                    int[][] matrixNumb = new int[13][13];
                    for (int i = 0; i < 13; i++) {
                        matrixNumb[0][i] = i;
                        matrixNumb[i][0] = i;
                    }
                    for (int i = 1; i < 13; i++) {

                        for (int j = 1; j < 13; j++) {
                            matrixNumb[i][j] = i * j;
                        }
                    }
                    for (int i = 0; i < 13; i++) {
                        System.out.println("");
                        for (int j = 0; j < 13; j++) {
                            System.out.print(matrixNumb[i][j]);
                            if (matrixNumb[i][j] >= 10 && matrixNumb[i][j] < 100) {
                                System.out.print(" ");
                            } else if (matrixNumb[i][j] <= 9) {
                                System.out.print("  ");
                            }
                            System.out.print("|");
                        }
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