package matrices._exercises;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many lines? ");
        int m = scan.nextInt();
        System.out.println("How many positions per line");
        int n = scan.nextInt();

        int[][] mat = new int[m][n];

        System.out.println("Enter the values in order, example: '23 40 50 3' ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("Choose a typed number: ");
        int x = scan.nextInt();
        System.out.println();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }
    }
}
