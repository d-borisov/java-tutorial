package nikolai;

import junit.framework.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BitwiseOperatorsTest extends Assert {

    @Test
    public void binaryShiftTest(){

        int binary1 = 0b010;
        int binary2 = 0b101;

        assertThat((binary1|binary2),is(0b111));
        assertThat((binary1&binary2),is(0b0));

        assertThat(binary1 <<1, is(0b100));
        assertThat(binary1 <<2, is(0b1000));

        assertThat(binary1 >>1, is(0b01));
        assertThat(binary1 >> 2, is(0b0));

        assertThat(binary1 >>> 2, is(0b0));
        assertThat(binary1 >>>1, is(0b01));

        binary1 = 0b1;
        binary2 = 0b1;
        assertThat((binary2^binary1),is(0b0));

        binary1 = 0b0;
        binary2 = 0b0;
        assertThat((binary2^binary1),is(0b0));

        binary1 = 0b0;
        binary2 = 0b1;
        assertThat((binary2 ^ binary1), is(0b1));

        assertThat((binary1 | binary1), is(binary1));
        assertThat((binary1 & binary1), is(binary1));

    }
}
