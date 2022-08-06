package ifquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GradeProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(bufferedReader.readLine());
        String grade = "";

        if(score>=90) {
            grade = "A";
        } else  if (score>=80) {
            grade = "B";
        } else if(score >=70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println(grade);

    } // end main
} // end class
