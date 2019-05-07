package pl.hospital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Consumer;

@RestController
public class TestController {

    @GetMapping("/test")
    public void test(){
        doo(this::metoda);
    }

    private String metoda(String testController) {
        System.out.println(testController);
        return testController+testController;
    }


    public <T> void doo(Consumer<String> t){
        String g = "87";
        t.accept(g);
    }
}
