package guru.springframework.dependencyinjectionexamples;

import com.sun.org.apache.xml.internal.security.utils.I18n;
import com.sun.tools.internal.jxc.ap.Const;
import guru.springframework.dependencyinjectionexamples.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionExamplesApplication {

  public static void main(String[] args) {

    ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionExamplesApplication.class, args);

    System.out.println("--------Profile---------");
    I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
    System.out.println(i18nController.sayHello());


    System.out.println("--------Primary Bean---------");
    MyController myController = (MyController) applicationContext.getBean("myController");
    String greetings = myController.sayHello();
    System.out.println(greetings);


    System.out.println("--------Property---------");
    PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
    System.out.println(propertyInjectedController.sayHello());


    System.out.println("--------Settter---------");
    SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
    System.out.println(setterInjectedController.sayHello());

    System.out.println("--------Constructor---------");
    ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
    System.out.println(constructorInjectedController.sayHello());
  }

}
