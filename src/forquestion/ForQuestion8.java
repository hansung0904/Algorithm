package forquestion;

import java.util.Scanner;

public class ForQuestion8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int arr[] = new int[testCase];
        for (int i = 0; i < arr.length; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[i] = a + b;
        }
        scanner.close();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Case #"+ (i+1) + ": "+ arr[i]);
        }
    }
}