package nikolai;

import junit.framework.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ComparisonOperators extends Assert {
    @Test
    public void comparisonTest() {
        int value1 = 1;
        int value2 = 2;

        assertThat(value1 == value2, is(false));
        assertThat(value1 != value2, is(true));

        assertThat(value1 > value2, is(false));
        assertThat(value1 < value2, is(true));

        assertThat(value1 <= value2, is(true));
        assertThat(value1 >= value2, is(false));

        value1 = 1;
        value2 = 1;
        assertThat(value1 <= value2, is(true));
        assertThat(value1 >= value2, is(true));

    }

    @Test
    public void conditionalOperators() {
        int value1 = 1;
        int value2 = 2;

        assertTrue((value1 == 1) && (value2 == 2));
        assertTrue((value1 == 1) || (value2 == 10000));
        assertTrue((value1 == 1) || (value2 == 10000));

        boolean veryTrue = true;
        value1 = veryTrue ? 2 : 1;
        assertEquals(value1,2);

    }
}
