package dima.generics.mvc;

import dima.generics.mvc.agregations.ApplicationController;
import dima.generics.mvc.agregations.ApplicationModel;
import dima.generics.mvc.agregations.ApplicationView;
import dima.generics.mvc.factories.ViewsFactory;

public class Application {

  public static void main(String[] args) {
    final ApplicationModel model = new ApplicationModel();
    final ApplicationView view = new ApplicationView(ViewsFactory.factory());
    final ApplicationController controller = new ApplicationController(model, view);

    controller.foo();
  }
}
