package stringquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1316 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = 0;
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            if (check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
        String word = br.readLine();

        for (int i = 0; i < word.length(); i++) {
            int now = word.charAt(i);

            if (prev != now) {
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }
}
