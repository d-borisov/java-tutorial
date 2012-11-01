package dima.generics.mvc.agregations;

import dima.generics.mvc.base.BaseView;
import dima.generics.mvc.factories.ViewsFactory;
import dima.generics.mvc.first.FirstView;
import dima.generics.mvc.first.FixturesFirstView;

public class ApplicationView extends BaseView<ApplicationModel> {
  private final FirstView first;

  public ApplicationView(ViewsFactory factory) {
    this.first = factory.first();
  }

  public FirstView getFirst() {
    return first;
  }

  @Override
  public void show(ApplicationModel model) {
  }
}
