package IoC.Container.Annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("hoca")
@Primary
public class Hoca implements Araci{
    @Override
    public void hareket() {
        System.out.println("Hoca Kosuyor");
    }
}
