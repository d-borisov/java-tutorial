package dima.generics.mvc.base;

import dima.generics.mvc.mvc.Model;
import dima.generics.mvc.mvc.View;

abstract public class BaseView<Tm extends BaseModel> implements View<Tm> {

  @Override
  abstract public void show(Tm model);

  protected Shower returnShower(Tm model) {
    return Shower.NULL_SHOWER;
  }

  protected static interface Shower {
    void show();

    public static final Shower NULL_SHOWER = new Shower() {
      @Override
      public void show() {
      }
    };
  }
}
