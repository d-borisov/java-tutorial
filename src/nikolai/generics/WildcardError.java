package nikolai.generics;

import java.util.List;

public class WildcardError {

  void foo(List<?> i) {
    fooHelperMethod(i);
  }

  private <T> void fooHelperMethod(List<T> list) {
    list.set(0, list.get(0));
  }


}
