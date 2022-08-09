package forquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ForQuestion16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalAmount = Integer.parseInt(br.readLine());
        int typeNumber = Integer.parseInt(br.readLine());
        int sumPrice = 0;

        for (int i = 0; i < typeNumber; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int price = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());
            sumPrice += price * number;
        }

        br.close();

        if (totalAmount == sumPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
