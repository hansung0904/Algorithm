package functionquestion;

import java.util.ArrayList;
import java.util.List;

public class Question2Refactoring {
    public static void main(String[] args) {
        List<String> number = new ArrayList<String>();
        List<String> selfNumber = new ArrayList<String>();

        for (int i = 0; i < 10001; i++) {
            number.add(Integer.toString(i));
            selfNumber.add(Integer.toString(i));
        }

        for (String num : number) {
            int checkNumber = 0;
            for (Character character : num.toCharArray()) {
                checkNumber += Integer.parseInt(character.toString(character));

                if (num.length() != 1) {
                    selfNumber.remove(num);
                }
                if (num.length() == 1) {
                    if (Integer.parseInt(num) % 2 == 0) {
                        selfNumber.remove(num);
                    }
                }
            }
        }

        for (String num : selfNumber) {
            System.out.println(num);
        }


    }
}
