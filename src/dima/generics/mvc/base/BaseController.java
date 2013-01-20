package dima.generics.mvc.base;

import dima.generics.mvc.mvc.Controller;
import dima.generics.mvc.mvc.Model;
import dima.generics.mvc.mvc.View;

abstract public class BaseController<Tm extends Model, Tv extends View<Tm>> implements Controller<Tm, Tv> {

  private final Tm model;
  private final Tv view;

  public BaseController(Tm model, Tv view) {
    this.model = model;
    this.view = view;
    update();
  }

  protected final void update() {
    view.show(model);
  }

  protected Tm getModel() {
    return model;
  }

  protected Tv getView() {
    return view;
  }
}
