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
                new TestObject(1492, "wookey", Arrays.asList("apple", "graph", "watermelon"), Arrays.asList(36,4,16,3151,2))
                , new TestObject(1245, "sfd", Arrays.asList("dsgfdg", "tjgfhj", "sdgb"), Arrays.asList(1,15,15,1252))
                , new TestObject(352, "dsgs", Arrays.asList("fdgd", "gh", "gj"), Arrays.asList(57,6,245,235,3125))
                , new TestObject(3632, "fhfh", Arrays.asList("bnbvb", "ghjghj", "qr3"), Arrays.asList(24,14,124,214))
                , new TestObject(3636, "yoan", Arrays.asList("cs", "gfs", "gffgj"), Arrays.asList(7,57,35,2331,3))
                , new TestObject(56856, "xcv", Arrays.asList("asfdg", "aawf", "vb"), Arrays.asList(57,523,4,134,14))
                , new TestObject(21, "hkf", Arrays.asList("bn", "tjrtj", "gdjs"), Arrays.asList(124,165,3216,35))
                , new TestObject(742, "sdfk", Arrays.asList("egwe", "ytu", "sdga"), Arrays.asList(578,3465,314,2))
        );
        apiData.put("objectList", testObject2);

        return apiData;
    }
}
