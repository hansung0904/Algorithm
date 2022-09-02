package stringquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력값 받기 위해서
        StringBuilder sb = new StringBuilder(); // split 해주려고

        int inputTestCase = Integer.parseInt(br.readLine()); // 테스트케이스를 적어주기 위한 변수

        for (int i = 0; i < inputTestCase; i++) { // 입력한 테스트 케이스의 숫자까지 반복해라
            String[] word = br.readLine().split(" "); // br에 split으로 공백을 넣어줘서 구분

            int repetition = Integer.parseInt(word[0]); // word 배열에 0번방에 있는것 만큼 반복해야하니까 parseInt로 형변환

            for (byte result : word[1].getBytes()) { // 구글링을 통해서 getBytes메서드 찾아서 사용
                for (int j = 0; j < repetition; j++) {
                    sb.append((char) result); //  append는 문자열 끝에 문자열을 더 할 수 있게 해주는 메서드 result 변수가 byte로 되어있으니 char로 형 변환
                }
            }
            sb.append('\n'); // 개행을 위해서
        }
        System.out.println(sb); // sb출력
        br.close();

    }
}
