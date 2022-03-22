package com.southwind.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@NotEmpty
public class Student {
    private long id ;
    private String name;
    private int age;
    public Student(){}

    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
