package dima.enums;

public class EnumMethodsUser {

  enum EmptyEnum {
    ;

    public static void method() {
      System.out.println("EmptyEnum method");
    }
  }

  enum NotEmptyEnum {
    Value1;

    public static void method() {
      System.out.println("NotEmptyEnum Value1 method");
    }
  }

  interface MethodApplier {
    void method();
  }

  enum CommonInterfacedEnum implements MethodApplier {
    Value1,
    Value2;

    @Override
    public void method() {
      System.out.println("CommonInterfacedEnum " + this.name() + " method");
    }
  }

  enum DetailedInterfacedEnum implements MethodApplier {
    Value1 {
      @Override
      public void method() {
        System.out.println("DetailedInterfacedEnum Value1 method");
      }
    },

    Value2 {
      @Override
      public void method() {
        System.out.println("DetailedInterfacedEnum Value2 method");
      }
    };
  }

  public static void main(String[] args) {
    EmptyEnum.method();
    NotEmptyEnum.Value1.method();

    invokeMethodApplier(CommonInterfacedEnum.Value1);
    invokeMethodApplier(CommonInterfacedEnum.Value2);

    invokeMethodApplier(DetailedInterfacedEnum.Value1);
    invokeMethodApplier(DetailedInterfacedEnum.Value2);
  }

  private static void invokeMethodApplier(MethodApplier applier) {
    applier.method();
  }
}

