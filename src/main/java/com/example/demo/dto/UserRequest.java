package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

//@JsonNaming(value= PropertyNamingStrategy.SnakeCaseStrategy.class) //스네이크 케이스로 넘어온 파라미터를 mapping 시켜줌.
//@JsonInclude(JsonInclude.Include.NON_NULL) //Response를 Object로 돌려줄 때 mapping된 필드에 값이 없으면 JSON 결과로 나타나지 않게 한다.
public class UserRequest {
    private String name;
    private String email;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
