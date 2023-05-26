package JavaTutorials.Javaclasslab15.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class Hellocontroller {
    @GetMapping(value = "/")
    public String hello() {
        return "hello";
    }
}
