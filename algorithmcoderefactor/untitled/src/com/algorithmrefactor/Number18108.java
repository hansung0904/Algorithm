package com.algorithmrefactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*불기 연도를 서기 연도로 변환한 결과를 출력한다. 입력받은 값에서 -543을 해주면 서기 연도가 나온다*/
public class Number18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputYear = Integer.parseInt(br.readLine());
        System.out.println(inputYear - 543);
        br.close();
    }
}
