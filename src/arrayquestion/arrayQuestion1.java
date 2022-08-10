package arrayquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayQuestion1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberCount = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        List<Integer> list = new ArrayList<Integer>();


        for (int i = 0; i < numbers.length; i++) {
            list.add(Integer.parseInt(numbers[i]));
        }

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.print(min + " " + max);


    }
}
