package forquestion;

import java.util.Scanner;

public class ForQuestion12 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int xNumber = scanner.nextInt();
        int arr[] = new int[number];
        for(int i = 0; i< arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i< arr.length; i++) {
            if(xNumber > arr[i]) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}