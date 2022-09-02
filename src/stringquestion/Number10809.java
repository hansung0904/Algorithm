package stringquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // bufferedReader로 입력 값 받음
        int[] result = new int[26]; // a~z까지의 알파벳 갯수는 26개이다
        String word = br.readLine(); // word라는 변수에 버퍼드 리더 저장 ( baekjoon을 입력받기 위해서)

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        for (int i = 0; i < word.length(); i++) {
            char splitWord = word.charAt(i);

            if (result[splitWord - 'a'] == -1) { // result의 원소 값이 -1인 경우에 초기화시켜버린다.
                result[splitWord - 'a'] = i;

            }
        }

        for (int result2 : result) { // foreach로 배열 뽑아냄
            System.out.print(result2 + " "); // 출력값이 가로에다가 한칸 씩 공백을 넣어주어야한다.
        }

        br.close();
    }
}
