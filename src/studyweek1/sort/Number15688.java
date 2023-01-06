package studyweek1.sort;

import java.io.*;

/**
 * 일반 내장메서드 정렬로는 시간초과를 해결 할 수 없어서
 * 구글링한 결과 countingSort라는 알고리즘을 알게되었다.
 * countingSort는 대상이 되는 수의 범위가 적을 때 범위크기의 배열을 만들어서 다 넣어준다.
 * 고치고싶은 점은 countingSortAlgorithm이라는 메소드를 만들어서 메소드 분리를 해보면 어떨까?
 * 또한 10,000,000 일 때 쓰면 매우 유용하다고 하니 예시로 배열에 10,000,000 을 넣어주었다.
 */
public class Number15688 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 0;
        n = Integer.parseInt(bufferedReader.readLine());

        int[] saveNumbers = new int[n];
        for (int i = 0; i < saveNumbers.length; i++) {
            saveNumbers[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int[] limitNumbers = new int[2000001];

        for (int i = 0; i < n; i++) {
            limitNumbers[saveNumbers[i] + 1000000]++;
        }

        for (int i = 0; i < limitNumbers.length; i++) {
            for (int j = 0; j < limitNumbers[i]; j++) {
                bufferedWriter.write(i - 1000000 + "");
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.close();
    }
}
