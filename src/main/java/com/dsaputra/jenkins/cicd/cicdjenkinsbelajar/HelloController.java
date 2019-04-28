package com.dsaputra.jenkins.cicd.cicdjenkinsbelajar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String hello() {
        return "Belajar Create Pipeline with Jenkins CI/CD - 20190429";
    }
}
