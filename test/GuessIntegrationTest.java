import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessIntegrationTest {

    Guess guess;

    @Before
    public void initialize() {
        Random randomMock = mock(Random.class);
        when(randomMock.nextInt(10)).thenReturn(1, 2, 3, 4);

        guess = new Guess(new AnswerGenerator(randomMock), new CompareNumber());
    }

    @Test
    public void guess_integration_test_when_answer_match() {
        assertThat(guess.guessNumber("1234"), is("4A0B"));
    }

    @Test
    public void guess_integration_test_when_answer_some_match() {
        assertThat(guess.guessNumber("4321"), is("0A4B"));
    }

    @Test
    public void guess_integration_test_when_answer_not_match() {
        assertThat(guess.guessNumber("5678"), is("0A0B"));
    }
}
