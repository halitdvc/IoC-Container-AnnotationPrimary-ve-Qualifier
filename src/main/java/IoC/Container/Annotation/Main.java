package IoC.Container.Annotation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Konfigurasyon.class);

        Okul okul = applicationContext.getBean(Okul.class);
        okul.hareket();

        Hoca bike = applicationContext.getBean(Hoca.class);
        bike.hareket();

        Kosanlar cycle = applicationContext.getBean(Kosanlar.class);
        cycle.kosmayaBasla();



    }
}