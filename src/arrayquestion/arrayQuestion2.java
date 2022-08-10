package arrayquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class arrayQuestion2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        try {
            for (int i = 0; i < 9; i++) {
                int num = Integer.parseInt(br.readLine());
                arrayList.add(num);
            }
            int max = Collections.max(arrayList);
            System.out.println(max);
            System.out.println(arrayList.indexOf(max) + 1);
        } catch (IOException e) {
        }
    }
}
