package com.rpg;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class RpjApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void TestAc(){

        class Student{
            public String name;
            public Integer age;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getAge() {
                return age;
            }

            public void setAge(Integer age) {
                this.age = age;
            }
        }

        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(20);

        List<Student> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);

        for (Student s : list) {
            System.out.println(s);
        }
    }
}


