package arrayquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayQuestion5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bufferedReader.readLine());
        List<String> quizResult = new ArrayList<String>();

        for (int i = 0; i < testCase; i++) {
            quizResult.add(bufferedReader.readLine());
        }

        for (int i = 0; i < quizResult.size(); i++) { // quizResult 사이즈의 갯수만큼 돌리겠다
            int count = 0;
            int quizScore = 0;
            for (int j = 0; j < quizResult.get(i).length(); j++) {
                char one = quizResult.get(i).charAt(j);
                if (one == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                quizScore = quizScore + count;

            }
            System.out.println(quizScore);
        }
    }
}
