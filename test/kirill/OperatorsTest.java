package kirill;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperatorsTest {

  @Test
  public void arithmetic() {
    int minus = 6 - 5;
    assertEquals(minus, 1);

    int plus = 10 + 12;
    assertEquals(plus, 22);

    int multiplication = 13 * 4;
    assertEquals(multiplication, 52);

    int division = 100 / 4;
    assertEquals(division, 25);
  }

  @Test
  public void concatenation(){
    String onePart = "Папи зде";
    String twoPart = "Папи зде";
    String threePart = "Папи зделали";
    String fourPart = "укол";

    String result = onePart + " " + twoPart + " " + threePart + " " + fourPart;

    assertEquals(result, "Папи зде Папи зде Папи зделали укол");

  }

  @Test
  public void unary(){
    int result = +1;
    assertEquals(result, 1);

    int resTwo = -5;
    assertEquals(resTwo, -5);

    resTwo++;
    assertEquals(resTwo, -4);

    --result;
    assertEquals(result, 0);
  }

}
