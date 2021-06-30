package com.example.rest_api_test.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
public class TestController {

    @GetMapping(value = "/api1")
    @ResponseBody
    public Map<String, Object> api1() {
        Map<String, Object> apiData = new HashMap<>();

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        apiData.put("list", list);

        Map<String, Object> map = new HashMap<>();
        map.put("string", "stringData");
        map.put("int", 12345);
        map.put("boolean", false);
        map.put("list", list.stream().map(i -> String.valueOf(i)).collect(Collectors.toList()));
        apiData.put("map", map);

        return apiData;
    }
}
