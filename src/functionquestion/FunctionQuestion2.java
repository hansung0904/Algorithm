package functionquestion;

public class FunctionQuestion2 {
    public static void main(String[] args) {

        boolean[] checkingNumber = new boolean[10001]; // 1부터 10000만까지는 비교해야하기에 10001

        for (int i = 1; i < 10001; i++) { // 1부터 10000까지는 나와야하니까
            int number = d(i);

            if (number < 10001) { // 10000이 넘는 수는 나올 필요가 없다.
                checkingNumber[number] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!checkingNumber[i]) { // false값만 튀어나오게 하면 된다.
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);


    }

    public static int d(int number) {
        int sum = number;

        while (number != 0) {
            sum = sum + (number % 10); // 일의 자리수 표현
            number = number / 10; // 십의 자리수 표현
        }
        return sum;
    }
}
