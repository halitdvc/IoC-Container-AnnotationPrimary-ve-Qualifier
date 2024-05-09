package IoC.Container.Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "IoC.Container.Annotation")
public class Konfigurasyon {
    @Bean
    public Araci hoca () { return new Okul();}
    @Bean
    public Araci bike() { return new Hoca();}
    @Bean
    public Araci cycle(){ return new Ogrenci();}
    @Bean
    public Kosanlar traveller(){
        return new Kosanlar(hoca());
        // Dependency Incject

    }

}
