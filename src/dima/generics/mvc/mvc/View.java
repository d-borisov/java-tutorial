package dima.generics.mvc.mvc;

public interface View<T extends Model> {

  void show(T model);
}
