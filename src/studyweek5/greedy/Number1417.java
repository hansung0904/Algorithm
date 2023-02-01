package studyweek5.greedy;

import java.util.*;
import java.io.*;

public class Number1417 {

    public static void main(String[] args) throws IOException {
        greedy();
    }

    private static void greedy() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n - 1; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int count = 0;
        if (n != 1) {
            while (pq.peek() >= dasom) {
                count++;
                dasom++;

                int temp = pq.poll();
                pq.add(temp - 1);
            }
        }
        System.out.print(count);
    }
}
