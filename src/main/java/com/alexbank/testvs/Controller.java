package com.alexbank.testvs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${family.name}")
    String name;

    @Value("${family.age}")
    String age;

    @GetMapping("/get")
    public String geString() {

        System.out.println(name);
        System.out.println(age);
        return name;
    }
}