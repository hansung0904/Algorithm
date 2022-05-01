package forquestion;

import java.util.Scanner;

public class ForQuestion10 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int starNumber = scanner.nextInt();

        for (int i = 1; i<=starNumber; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}