package com.example.rest_api_test.service;

import com.example.rest_api_test.model.TestObject;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TestApiService {
    public Map<String, Object> getApiData() {
        Map<String, Object> apiData = new HashMap<>();

        // string
        apiData.put("string", "stringData");

        // list
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        apiData.put("list", list);

        // map
        Map<String, Object> map = new HashMap<>();
        map.put("key", "value");
        map.put("listKey", list.stream().map(i -> String.valueOf(i)).collect(Collectors.toList()));
        apiData.put("map", map);

        // object
        TestObject testObject = TestObject.builder()
                .id(1492)
                .name("wookey")
                .likeList(Arrays.asList("car", "tank", "tank", "tank", "tank", "car", "airplain", "porkrain", "airplain", "car"))
                .build();

        apiData.put("object", testObject);

        // object list
        List<TestObject> testObject2 = Arrays.asList(
                new TestObject(1492, "wookey", Arrays.asList("apple", "graph", "watermelon"))
                , new TestObject(1245, "sfd", Arrays.asList("dsgfdg", "tjgfhj", "sdgb"))
                , new TestObject(352, "dsgs", Arrays.asList("fdgd", "gh", "gj"))
                , new TestObject(3632, "fhfh", Arrays.asList("bnbvb", "ghjghj", "qr3"))
                , new TestObject(3636, "yoan", Arrays.asList("cs", "gfs", "gffgj"))
                , new TestObject(56856, "xcv", Arrays.asList("asfdg", "aawf", "vb"))
                , new TestObject(21, "hkf", Arrays.asList("bn", "tjrtj", "gdjs"))
                , new TestObject(742, "sdfk", Arrays.asList("egwe", "ytu", "sdga"))
        );
        apiData.put("objectList", testObject2);

        return apiData;
    }
}
