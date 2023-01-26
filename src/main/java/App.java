import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld hw_1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld hw_2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Сравнение HelloWorld: " + (hw_1 == hw_2));

        Cat cat_1 = (Cat) applicationContext.getBean("cat");
        Cat cat_2 = (Cat) applicationContext.getBean("cat");
        System.out.println("Сравнение Cat: " + (cat_1 == cat_2));
    }
}