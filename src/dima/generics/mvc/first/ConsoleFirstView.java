package dima.generics.mvc.first;

import dima.generics.mvc.base.BaseView;

import java.io.Console;

public class ConsoleFirstView extends BaseView<FirstModel> implements FirstView  {

  private final Console console;

  public ConsoleFirstView(Console console) {
    this.console = console;
  }

  @Override
  public void show(FirstModel model) {
    System.out.printf("Hellow, %s.%n", model.getUserName());
  }

  @Override
  public String readUserName() {
    return console.readLine("Enter your name: ");
  }
}
