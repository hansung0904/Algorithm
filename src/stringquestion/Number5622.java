package stringquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number5622 {
    public static void main(String[] args) throws IOException {

        int count = 0;
        int word;

        while (true) {
            word = System.in.read();

            if (word == '\n') {
                break;
            }
            if (word < 68) {
                count += 3;
            } else if (word < 71) {
                count += 4;
            } else if (word < 74) {
                count += 5;
            } else if (word < 77) {
                count += 6;
            } else if (word < 80) {
                count += 7;
            } else if (word < 84) {
                count += 8;
            } else if (word < 87) {
                count += 9;
            } else {
                count += 10;
            }
        }
        System.out.println(count);

    }
}

