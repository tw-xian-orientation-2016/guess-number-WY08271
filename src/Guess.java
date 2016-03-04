public class Guess {
    private String answer;
    private CompareNumber compareNumber;

    public Guess(AnswerGenerator answerGenerator, CompareNumber compareNumber) {
        this.answer = answerGenerator.generator();
        this.compareNumber = compareNumber;
    }

    public String guessNumber(String number) {
        return this.compareNumber.compare(number, this.answer);
    }
}
