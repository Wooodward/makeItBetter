package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan(basePackages = {"place","user"})
public class Application{

    @RequestMapping("/")
    String home() {
        return "It's the root page";
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
