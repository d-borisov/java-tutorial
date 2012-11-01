package dima.generics.mvc.factories;

import dima.generics.mvc.first.FirstView;

import java.io.Console;

abstract public class ViewsFactory {

  abstract public FirstView first();

  public static ViewsFactory factory() {
    final Console console = System.console();
    if (console != null) {
      return new ConsoleFactory(console);
    }
    return new FixturesFactory();
  }
}
