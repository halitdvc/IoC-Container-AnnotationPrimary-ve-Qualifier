package IoC.Container.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveller")
public class Kosanlar {
    private Araci araci;
    @Autowired
    public Kosanlar (@Qualifier("hoca") Araci araci) {
        this.araci = araci;
    }
    public void kosmayaBasla(){
        this.araci.hareket();
    }
}
