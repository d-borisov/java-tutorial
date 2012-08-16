package kirill.Annotations;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.Arrays;

@Using
@SupportedAnnotationTypes("kirill.Annotations.Using")
public class ImplementUsingAnnotationProcessor {
  public static void main(String[] args) {
    ImplementUsingAnnotationProcessor a = new ImplementUsingAnnotationProcessor();
    SupportedAnnotationTypes annotation = a.getClass().getAnnotation(SupportedAnnotationTypes.class);
  }
}
