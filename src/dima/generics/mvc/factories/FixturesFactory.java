package dima.generics.mvc.factories;

import dima.generics.mvc.first.FixturesFirstView;

public class FixturesFactory extends ViewsFactory {

  @Override
  public FixturesFirstView first() {
    return new FixturesFirstView();
  }
}
