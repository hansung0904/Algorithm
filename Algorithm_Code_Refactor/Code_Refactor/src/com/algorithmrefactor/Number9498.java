package com.algorithmrefactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.*/
public class Number9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int inputScore = Integer.parseInt(bufferedReader.readLine());
        String grade = "";
        if (inputScore >= 90) {
            grade = "A";
        } else if (inputScore >= 80) {
            grade = "B";
        } else if (inputScore >= 70) {
            grade = "C";
        } else if (inputScore >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println(grade);
        bufferedReader.close();
    }

}
