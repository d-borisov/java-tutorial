package kirill.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;

public class HashMapTest extends Assert {

  @Test
  public void hashMap_set_null_in_key_test(){
    Map<Object, Object> map = new HashMap<>();

    map.put(null, "string");
    assertThat((String) map.get(null), is("string"));
  }

}
