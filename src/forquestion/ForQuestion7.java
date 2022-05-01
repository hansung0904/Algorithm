package forquestion;

import java.util.Scanner;

public class ForQuestion7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reversNumber = scanner.nextInt();

        for(int i =reversNumber; i>=1; i--) {
            System.out.println(i);
        }
    }
}