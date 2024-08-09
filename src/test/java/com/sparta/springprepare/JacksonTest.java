package com.sparta.springprepare;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.springprepare.model.Star;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class JacksonTest {

    @Test
    @DisplayName("Object To Json : get Method 필요")
    void test() throws JsonProcessingException {
        Star star = new Star("kkm4512", 12);
        ObjectMapper om = new ObjectMapper();
        String json = om.writeValueAsString(star);
        System.out.println(json);
    }

    @Test
    @DisplayName("JSON To Object : 기본 생성자 & (get OR set) Method 필요")
    void test2() throws JsonProcessingException {
        String json = "{\"name\":\"Robbie\",\"age\":95}"; // JSON 타입의 String

        ObjectMapper objectMapper = new ObjectMapper(); // Jackson 라이브러리의 ObjectMapper
        Star star = objectMapper.readValue(json, Star.class);
        System.out.println("star.getName() = " + star.getName());
        System.out.println("star.getAge() = " + star.getAge());

    }
}
