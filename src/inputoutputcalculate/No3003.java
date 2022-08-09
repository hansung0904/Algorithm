package inputoutputcalculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int king = 1 - Integer.parseInt(st.nextToken());
        int queen = 1 - Integer.parseInt(st.nextToken());
        int rook = 2 - Integer.parseInt(st.nextToken());
        int bishop = 2 - Integer.parseInt(st.nextToken());
        int knight = 2 - Integer.parseInt(st.nextToken());
        int pawn = 8 - Integer.parseInt(st.nextToken());
        System.out.print(
            king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
        System.out.println();


    }
}
