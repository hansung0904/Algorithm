package studyweek1.sort;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Number1015 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[][] array = new int[n][3]; // Column 3, br로 입력받은 값을 Row 로 2차원 배열 선언`

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 문자열 쪼개기 

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(stringTokenizer.nextToken()); // String 타입이기 때문에 Integer 로 파싱
            array[i] = new int[]{val, i, 0};
        }
        Arrays.sort(array, Comparator.comparingInt(o -> o[0])); // 0번째 컬럼 비교하면서 정렬

        for (int i = 0; i < n; i++) {
            array[i][2] = i; // array[n][2] 에 0 ,1, 2 삽입
        }
        Arrays.sort(array, Comparator.comparingInt(o -> o[1])); //1번째 컬럼 비교하면서 정렬

        for (int i = 0; i < n; i++) {
            System.out.print(array[i][2] + " "); // [0][2] ... [1][2],,, [2][2] 순으로 출력
        }
    }
}
