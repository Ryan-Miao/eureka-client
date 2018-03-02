package com.test.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthSettingController {

    @Autowired
    MyHealthChecker myHealthChecker;

    @RequestMapping("/health/{status}")
    public String up(@PathVariable("status") Boolean status) {
        myHealthChecker.setUp(status);

        return status.toString();
    }

}
