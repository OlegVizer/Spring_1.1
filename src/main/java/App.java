import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hello1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(hello1.getMessage());
        HelloWorld hello2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(hello2.getMessage());
        Cat cat1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.getVoice());
        Cat cat2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(cat2.getVoice());
        System.out.println(hello1 == hello2);
        System.out.println(cat1 == cat2);
    }
}