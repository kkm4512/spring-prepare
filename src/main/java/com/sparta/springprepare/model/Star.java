package com.sparta.springprepare.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Star {
    public String name;
    public int age;
    public String hobby;

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
