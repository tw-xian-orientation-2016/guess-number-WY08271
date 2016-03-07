import java.util.Objects;

public class CompareNumber {

    public String compare(String answer, String number) {

        int A = 0, B = 0;
        String[] numberString = number.split("");
        String[] answerString = answer.split("");

        for (int i = 0; i < numberString.length; i++) {
            if (numberString[i].equals(answerString[i])) {
                A++;
            } else if (answer.contains(numberString[i])) {
                B++;
            }
        }

        return A + "A" + B + "B";
    }
}

