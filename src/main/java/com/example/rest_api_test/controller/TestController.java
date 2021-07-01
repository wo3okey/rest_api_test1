package com.example.rest_api_test.controller;

import com.example.rest_api_test.model.TestObject;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
public class TestController {

    @GetMapping(value = "/api1")
    @ResponseBody
    public Map<String, Object> api1() {
        Map<String, Object> apiData = new HashMap<>();

        // string
        apiData.put("string", "stringData");

        // list
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        apiData.put("list", list);

        // map
        Map<String, Object> map = new HashMap<>();
        map.put("key", "value");
        map.put("listKey", list.stream().map(i -> String.valueOf(i)).collect(Collectors.toList()));
        apiData.put("map", map);

        // object
        TestObject testObject = new TestObject(1492, "wookey", Arrays.asList("car", "tank"));
        apiData.put("object", testObject);

        // object list
        List<TestObject> testObject2 = Arrays.asList(
                 new TestObject(1492, "wookey", Arrays.asList("apple", "graph", "watermelon"))
                ,new TestObject(3523, "yoan", Arrays.asList("apple2", "graph2", "watermelon2"))
        );
        apiData.put("objectList", testObject2);

        return apiData;
    }
}
