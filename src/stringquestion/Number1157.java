package stringquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputWord = br.readLine();
        int[] arr = new int[26];

        for (int i = 0; i < inputWord.length(); i++) {
            if ('A' <= inputWord.charAt(i) && inputWord.charAt(i) <= 'Z') { // 대문자 범위
                arr[inputWord.charAt(i) - 'A']++;
            } else { // 소문자 범위
                arr[inputWord.charAt(i) - 'a']++;
            }
        }

        int max = -1; // 왜 -1로 초기화할까? arr[i]가 양수여야하기때문에 0보다더 커야하기때문
        char questionMark = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                questionMark = (char) (i + 65);
            } else if (arr[i] == max) {
                questionMark = '?';
            }
        }
        System.out.println(questionMark);
        br.close();

    }
}
