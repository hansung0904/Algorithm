package arrayquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class ArrayQuestion4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int subjectCount = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer sejuneScore =
            new StringTokenizer(bufferedReader.readLine()); // 세준이 현재 점수들
        List<Integer> sejunScoreList = new ArrayList<Integer>(); // 세준이 점수 리스트

        for (int i = 0; i < subjectCount; i++) { // countToken이 무슨 역할을 하는지 모르겠음.. --> 이해 완료
            sejunScoreList.add(Integer.parseInt(sejuneScore.nextToken()));
        }

        double total = 0;
        for (int i = 0; i < sejunScoreList.size(); i++) {
            total += sejunScoreList.get(i);
        }
        double max = Collections.max(sejunScoreList); // 세준이 최고 점수
        System.out.println(((total / max) * 100) / subjectCount);
    }
}
