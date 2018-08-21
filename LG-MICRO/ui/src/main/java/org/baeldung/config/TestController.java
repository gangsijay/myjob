package org.baeldung.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/ui1")
    public String user() {
        System.out.println("ui1");
        return "ui1";
    }
}
