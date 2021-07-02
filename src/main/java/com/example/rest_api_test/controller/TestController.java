package com.example.rest_api_test.controller;

import com.example.rest_api_test.model.TestObject;
import com.example.rest_api_test.service.TestApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Slf4j
public class TestController {
    private final TestApiService testApiService;

    @Autowired
    public TestController(TestApiService testApiService) {
        this.testApiService = testApiService;
    }

    @GetMapping(value = "/api1/{one}")
    @ResponseBody
    public Map<String, Object> get1(@PathVariable String one) {
        log.info("one : {}", one);

        return testApiService.getApiData();
    }

    @GetMapping(value = "/api2/{two}")
    @ResponseBody
    public TestObject get2(@PathVariable String two) {
        log.info("two : {}", two);

        Map<String, Object> data = testApiService.getApiData();
        return (TestObject) data.get("object");
    }
}
