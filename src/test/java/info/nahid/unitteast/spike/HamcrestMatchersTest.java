package info.nahid.unitteast.spike;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.List;

public class HamcrestMatchersTest {

    @Test
    public void learning() {
        List<Integer> numbers = Arrays.asList(12,15,45);

        assertThat(numbers, hasSize(3));
        assertThat(numbers, hasItems(12,45));
        assertThat(numbers, everyItem(greaterThan(10)));
        assertThat(numbers, everyItem(lessThan(100)));


        assertThat("", isEmptyString());
        assertThat("ABCD", containsString("BCD"));
        assertThat("ABCD", startsWith("ABC"));
        assertThat("ABCD", endsWith("BCD"));

    }
}
