package com.webapp.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class helloWorld {
    @GetMapping("/monitor")
    public String monitor() {
        return "monitor";
    }
}
