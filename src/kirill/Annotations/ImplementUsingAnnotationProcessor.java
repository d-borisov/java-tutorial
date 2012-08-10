package kirill.Annotations;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

@SupportedAnnotationTypes("kirill.Annotations.Using")
public class ImplementUsingAnnotationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        Messager messager = processingEnv.getMessager();

        System.out.println("/");

        for (TypeElement te : annotations) {
            System.out.println("*");

            for (Element e : roundEnv.getElementsAnnotatedWith(te)) {
                System.out.println("-");

                messager.printMessage(Diagnostic.Kind.OTHER, "Printing: " + e.toString());
            }
        }
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
