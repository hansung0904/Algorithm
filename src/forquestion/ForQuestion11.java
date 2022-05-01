package forquestion;

import java.util.Scanner;

public class ForQuestion11 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int testNumber = scanner.nextInt();
        for (int i = 1; i <= testNumber; i++) {
            for (int j = testNumber; j > i; j--) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}