package com.algorithmrefactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 입력받은 문자열 뒤에 ??!이 출력하도록 하세요*/
public class Number10926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputName = br.readLine();
        System.out.println(inputName + "??!");
        br.close();
    }
}
