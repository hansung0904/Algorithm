package ifquestion;

import java.util.Scanner;

public class IfQuestion7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int max = 0;
        int price = 0;

        if (i >= j && i >= k) {
            max = i;
        } else if (j >= i && j >= k) {
            max = j;
        } else if (k >= i && k > j) {
            max = k;
        }

        if (i == j && j == k) {
            price = 10_000 + (i * 1_000);
        } else if (i != j && j == k) {
            price = 1_000 + (j * 100);
        } else if (i == j && i != k) {
            price = 1_000 + (i * 100);
        } else if (i == k && j != k) {
            price = 1_000 + (i * 100);
        } else {
            price = max * 100;
        }
        System.out.println(price);
    }
}