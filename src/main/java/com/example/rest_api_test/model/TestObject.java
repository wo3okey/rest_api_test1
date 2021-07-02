package com.example.rest_api_test.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class TestObject {
    int id;
    String name;
    List<String> likeList;
    List<Integer> numberList;
}
