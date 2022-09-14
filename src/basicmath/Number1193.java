package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int crossCount = 1;
        int prevCountSum = 0;

        while (true) { // 직전 대각선 누적 합 구하기 + 해당 대각선 갯수 범위 판별하기
            if (x <= prevCountSum + crossCount) {
                if (crossCount % 2 == 1) { // 대각선의 갯수가 홀수라면
                    System.out.print((crossCount - (x - prevCountSum - 1)) + "/" + (x - prevCountSum));
                    break;
                } else {
                    System.out.print((x - prevCountSum) + "/" + (crossCount - (x - prevCountSum - 1)));
                    break;
                }
            } else {
                prevCountSum += crossCount;
                crossCount++;
            }
        }
        br.close();
    }
}
