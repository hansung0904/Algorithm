package com.algorithmrefactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다.
점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
*/
public class Number14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int inputX = Integer.parseInt(bufferedReader.readLine());
        int inputY = Integer.parseInt(bufferedReader.readLine());

        if (inputX > 0 && inputY > 0) {
            System.out.println(1);
        } else if (inputX < 0 && inputY > 0) {
            System.out.println(2);
        } else if (inputX < 0 && inputY < 0) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
        bufferedReader.close();
    }

}
