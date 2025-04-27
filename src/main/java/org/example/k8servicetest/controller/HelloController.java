package org.example.k8servicetest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${k8.application.name}")
    private String K8_APPLICATION_NAME;

    @GetMapping("/api/hello")
    public String hello() {
        return K8_APPLICATION_NAME;
    }
}