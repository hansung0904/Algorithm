package forquestion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ForQuestion14 {
    public static void main(String[] args) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            StringTokenizer st;

            while(true){
                try {
                    st = new StringTokenizer(br.readLine());
                    int a = Integer.parseInt(st.nextToken());
                    int b = Integer.parseInt(st.nextToken());
                    sb.append(a+b).append("\n");
                } catch(Exception e) {
                    break;
                }
            }
            System.out.print(sb);
        }
}