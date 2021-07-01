package com.example.rest_api_test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class TestObject {
    int id;
    String name;
    List<String> likeList;
}
