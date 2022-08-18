package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayQuestion6 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int testCount = Integer.parseInt(bufferedreader.readLine());
		int[] arr;

		for (int i = 0; i < testCount; i++) {
			st = new StringTokenizer(bufferedreader.readLine(), " ");

			int studentCount = Integer.parseInt(st.nextToken());
			arr = new int[studentCount];

			double sum = 0;

			for (int j = 0; j < studentCount; j++) {
				int studentScore = Integer.parseInt(st.nextToken());
				arr[j] = studentScore;
				sum += studentScore;
			}

			double mean = (sum / studentCount);
			double count = 0;

			for (int j = 0; j < studentCount; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/studentCount)*100);
		}

	}
}
