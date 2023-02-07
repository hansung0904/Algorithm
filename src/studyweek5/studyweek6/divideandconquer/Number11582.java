package studyweek5.studyweek6.divideandconquer;

import java.io.*;
import java.util.*;

public class Number11582 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        int k = Integer.parseInt(br.readLine());

        int div = n / k;

        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i += div) {
            ArrayList<Integer> temp = new ArrayList<>(arr.subList(i, i + div));
            Collections.sort(temp);
            answer.addAll(temp);
        }

        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
    }
}