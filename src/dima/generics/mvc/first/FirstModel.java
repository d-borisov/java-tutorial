package dima.generics.mvc.first;

import dima.generics.mvc.base.BaseModel;

public class FirstModel extends BaseModel {

  private String userName;

  public FirstModel(String userName) {
    this.userName = userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserName() {
    return userName;
  }

}
