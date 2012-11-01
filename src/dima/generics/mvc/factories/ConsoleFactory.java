package dima.generics.mvc.factories;

import dima.generics.mvc.first.ConsoleFirstView;
import dima.generics.mvc.first.FirstView;
import dima.generics.mvc.first.FixturesFirstView;

import java.io.Console;

public class ConsoleFactory extends ViewsFactory {

  private final Console console;

  public ConsoleFactory(Console console) {
    this.console = console;
  }

  @Override
  public FirstView first() {
    return new ConsoleFirstView(console);
  }
}
