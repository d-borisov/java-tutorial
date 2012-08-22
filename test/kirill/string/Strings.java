package kirill.string;

import junit.framework.Assert;
import org.junit.Test;

import java.lang.String;

public class Strings extends Assert {

  @Test
  public void getCharIndex(){
    String anotherPalindrome = "Niagara. O roar again!";
    char c = anotherPalindrome.charAt(9);
    assert c == 'O';
  }

  @Test
  public void concatenationString(){
    String hello = "Hello";
    String world = " world";
    char exclamation = '!';

    assertTrue(hello.concat(world).equals("Hello world"));
    assertFalse(hello.concat(world) == "Hello world");
  }

}
