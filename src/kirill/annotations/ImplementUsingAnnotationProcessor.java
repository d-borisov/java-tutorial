package kirill.annotations;

import javax.annotation.processing.SupportedAnnotationTypes;

@Using
@SupportedAnnotationTypes("kirill.annotations.Using")
public class ImplementUsingAnnotationProcessor {
  public static void main(String[] args) {
    ImplementUsingAnnotationProcessor a = new ImplementUsingAnnotationProcessor();
    SupportedAnnotationTypes annotation = a.getClass().getAnnotation(SupportedAnnotationTypes.class);
  }
}
