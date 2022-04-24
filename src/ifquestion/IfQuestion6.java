package ifquestion;

import java.util.Scanner;

public class IfQuestion6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int cookingtime = sc.nextInt();

        minute = minute + cookingtime;

        if (minute >= 60) {
            int quotient = minute / 60;
            hour = hour + quotient;
            minute = minute - (quotient * 60);
            if (hour > 23) {
                hour = hour - 24;
            }
        }
        System.out.println(hour +" " + minute);
    }
}
