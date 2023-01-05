package studyweek1.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number2750 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int countNumber = Integer.parseInt(bufferedReader.readLine());
        List<Integer> saveNumbers = new ArrayList<>();

        for (int i = 0; i < countNumber; i++) {
            int inputNumber = Integer.parseInt(bufferedReader.readLine());
            saveNumbers.add(inputNumber);
        }
        Collections.sort(saveNumbers);
        for (int i = 0; i < saveNumbers.size(); i++) {
            System.out.println(saveNumbers.get(i) + " ");
        }
    }
}
