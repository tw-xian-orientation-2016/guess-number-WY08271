import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CompareNumberTest {


    CompareNumber compareNumber;

    @Before
    public void setUp() {
        compareNumber = new CompareNumber();
    }

    @Test
    public void output_0A0B_when_answer_not_match() {
        String result = compareNumber.compare("1234", "5678");

        assertThat(result, is("0A0B"));
    }

    @Test
    public void output_4A0B_when_answer_all_match() {
        String result = compareNumber.compare("1234", "5678");

        assertThat(result, is("0A0B"));
    }

    @Test
    public void output_0A4B_when_answer_location_match() {
        String result = compareNumber.compare("1234", "5678");

        assertThat(result, is("0A0B"));
    }
}