package studyweek1.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number11931 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int countNumber = Integer.parseInt(bufferedReader.readLine());
        List<Integer> saveNumbers = new ArrayList<>();

        for (int i = 0; i < countNumber; i++) {
            int inputNumber = Integer.parseInt(bufferedReader.readLine());
            saveNumbers.add(inputNumber);
        }
        saveNumbers.sort(Collections.reverseOrder());

        for (int i = 0; i < saveNumbers.size(); i++) {
            bufferedWriter.write(saveNumbers.get(i) + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
