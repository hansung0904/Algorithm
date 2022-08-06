package ifquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadrantFound {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int coordinateX = Integer.parseInt(bufferedReader.readLine());
        int coordinateY = Integer.parseInt(bufferedReader.readLine());

        if (coordinateX > 0 && coordinateY > 0) {
            System.out.println(1);
        } else if (coordinateX > 0 && coordinateY < 0) {
            System.out.println(4);
        } else if (coordinateX < 0 && coordinateY > 0) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}
