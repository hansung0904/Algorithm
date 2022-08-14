package arrayquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class ArrayQuestion3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // 이건 걍 버퍼드 리더 써주기 위해서 만든거
        Set<Integer> numbers = new HashSet<Integer>(); // Set은 중복된 값을 알아서 걸러내서 표현해준다. 그래서 set 사용

        for (int i = 0; i < 10; i++) {  // 입력받는 값이 10개니까 포문은 0~10까지로 한정
            int number = Integer.parseInt(bufferedReader.readLine()); // 입력 값 10개를 number라는 변수에 담을거임
            numbers.add(number % 42); // 넘버라는 곳에 입력을 받았으니 42로 나눈 나머지 값 알기 위해서 number % 42 한 후에 numbers라는 셋에 담음
        }

        System.out.println(numbers.size()); // numbers의 사이즈 만큼 출력
    }
}
