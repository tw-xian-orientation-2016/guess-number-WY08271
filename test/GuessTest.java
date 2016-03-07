import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTest {

    @Test
    public void guess_unit_test() {
        AnswerGenerator answerGeneratorMock = mock(AnswerGenerator.class);
        when(answerGeneratorMock.generator()).thenReturn("1256");

        CompareNumber compareNumberMock = mock(CompareNumber.class);
        when(compareNumberMock.compare("1234", "1256")).thenReturn("2A2B");

        Guess guess = new Guess(answerGeneratorMock, compareNumberMock);

        String result = guess.guessNumber("1234");

        assertThat(result, is("2A2B"));
    }
}
