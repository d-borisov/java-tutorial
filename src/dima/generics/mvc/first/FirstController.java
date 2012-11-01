package dima.generics.mvc.first;

import dima.generics.mvc.base.BaseController;

public class FirstController extends BaseController<FirstModel, FirstView> {

  public FirstController(FirstModel model, FirstView view) {
    super(model, view);
  }

  public void getUserNameAndPrint() {
    final String name = getView().readUserName();
    getModel().setUserName(name);

    update();
  }
}
