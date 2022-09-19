package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int upTree = Integer.parseInt(st.nextToken());
        int downTree = Integer.parseInt(st.nextToken());
        int vehicleTree = Integer.parseInt(st.nextToken());

        int resultDay = (vehicleTree - downTree) / (upTree - downTree);
        if ((vehicleTree - downTree) % (upTree - downTree) != 0) {
            resultDay++;
        }
        System.out.println(resultDay);
        br.close();

    }
}
