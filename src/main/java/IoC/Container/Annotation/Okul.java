package IoC.Container.Annotation;

public class Okul implements Araci{
    @Override
    public void hareket() {
        System.out.println("Okul Kosuyor");
    }
}
