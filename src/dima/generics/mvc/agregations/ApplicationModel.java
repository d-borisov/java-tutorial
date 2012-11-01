package dima.generics.mvc.agregations;

import dima.generics.mvc.factories.ViewsFactory;
import dima.generics.mvc.base.BaseModel;
import dima.generics.mvc.first.FirstModel;

public class ApplicationModel extends BaseModel {
  private final FirstModel first;

  public ApplicationModel() {
    this.first = new FirstModel("unknown user");
  }

  public FirstModel getFirst() {
    return first;
  }
}
