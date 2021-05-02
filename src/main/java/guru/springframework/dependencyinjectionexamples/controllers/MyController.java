package guru.springframework.dependencyinjectionexamples.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Gowtham C on 02/05/21.
 */

@Controller
public class MyController {

  public String sayHello(){
    System.out.println("hello world!!!");

    return "hi folks";
  }
}
