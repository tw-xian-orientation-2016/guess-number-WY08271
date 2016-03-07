import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnswerGeneratorTest {

    @Test
    public void return_correct_format_when_generator_output() {
        Random randomMock = mock(Random.class);
        when(randomMock.nextInt(10)).thenReturn(1, 2, 3, 4);

        AnswerGenerator answerGenerator = new AnswerGenerator(randomMock);
        String answer = answerGenerator.generator();

        assertThat(answer, is("1234"));
    }

    @Test
    public void return_a_number_not_repeat_when_generator_output() {
        Random randomMock = mock(Random.class);
        when(randomMock.nextInt(10)).thenReturn(1, 3, 3, 4, 5);

        AnswerGenerator answerGenerator = new AnswerGenerator(randomMock);
        String answer = answerGenerator.generator();

        assertThat(answer, is("1345"));
    }
}
