package com.algorithmrefactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
입력받은 값은 ASCII 코드로 변환해주세요
*/
public class Number11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = br.readLine();
        System.out.println((int)result.toCharArray()[0]);
        br.close();
    }
}
