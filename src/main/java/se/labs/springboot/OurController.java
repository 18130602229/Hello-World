package se.labs.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OurController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World! is me";
    }

    @RequestMapping("/ping")
    @ResponseBody
    String ping() {
        return "pong";
    }

    @RequestMapping("/yo/{name}")
    @ResponseBody
    String yo(@PathVariable String name) {
        return "YO " + name;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(OurController.class, args);
    }
}
