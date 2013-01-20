package dima.generics.mvc.agregations;

import dima.generics.mvc.base.BaseController;
import dima.generics.mvc.first.FirstController;

public class ApplicationController extends BaseController<ApplicationModel, ApplicationView>{

  private final FirstController first;

  public ApplicationController(ApplicationModel model, ApplicationView view) {
    super(model, view);
    this.first = new FirstController(getModel().getFirst(), getView().getFirst());
  }

  public void foo() {
    first.getUserNameAndPrint();
  }
}
