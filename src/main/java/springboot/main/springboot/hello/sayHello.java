package springboot.main.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sayHello {

    @RequestMapping("/hello")
    public String helloMessage(){
        return "Hello Message using Spring Boot!!";
    }
}
