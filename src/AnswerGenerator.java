import java.util.Random;

public class AnswerGenerator {

    private Random random;

    public AnswerGenerator(Random random) {
        this.random = random;
    }

    public String generator() {
        String answer = "";

        while (answer.length() < 4) {

            int number = random.nextInt(10);

            if (!answer.contains(String.valueOf(number))) {
                answer += number;
            }
        }

        return answer;
    }
}
