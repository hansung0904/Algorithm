package ifquestion;

import java.util.Scanner;

public class IfQuestion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examGrade = scanner.nextInt();
        if (examGrade >= 90) {
            System.out.println("A");
        }
        else if (examGrade >= 89 || examGrade >= 80) {
            System.out.println("B");
        }
        else if (examGrade >= 79 || examGrade >= 70) {
            System.out.println("C");
        }
        else if (examGrade>=69 || examGrade>=60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
