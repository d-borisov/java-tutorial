package dima.generics.mvc.first;

import dima.generics.mvc.base.BaseView;

import java.io.Console;

public class FixturesFirstView extends BaseView<FirstModel> implements FirstView {

  @Override
  public void show(FirstModel model) {
    System.out.printf("Hellow, %s.%n", model.getUserName());
  }

  @Override
  public String readUserName() {
    return "Dima";
  }
}
