package inputoutputcalculate;

import java.util.Scanner;

public class No13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int hundredFigure = b / 100;
        int tenFigure = (b / 10) % 10;
        int firstDigit = b % 10;

        System.out.println(a * firstDigit);
        System.out.println(a * tenFigure);
        System.out.println(a * hundredFigure);
        System.out.println(a * b);
    }
}