package guru.springframework.dependencyinjectionexamples;

import com.sun.org.apache.xml.internal.security.utils.I18n;
import com.sun.tools.internal.jxc.ap.Const;
import guru.springframework.dependencyinjectionexamples.controllers.*;
import guru.springframework.dependencyinjectionexamples.services.PrototypeBean;
import guru.springframework.dependencyinjectionexamples.services.SingletonBean;
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

    System.out.println("--------Beans scope---------");
    SingletonBean singletonBean1 = applicationContext.getBean(SingletonBean.class);
    System.out.println(singletonBean1.getScope());
    SingletonBean singletonBean2 = applicationContext.getBean(SingletonBean.class);
    System.out.println(singletonBean2.getScope());


    PrototypeBean prototypeBean1  = applicationContext.getBean(PrototypeBean.class);
    System.out.println(prototypeBean1.getScope());
    PrototypeBean prototypeBean2  = applicationContext.getBean(PrototypeBean.class);
    System.out.println(prototypeBean2.getScope());


  }

}
