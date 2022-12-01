package com.example.springbootapi;

import com.example.springbootapi.models.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringbootApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApiApplication.class, args);


    }

    @GetMapping("/")
    public List<Student> hello(){
        return List.of(
                new Student(1L,
                        "Mason",
                        "mason.wudtree@gmail.com",
                        LocalDate.of(
                                2000,
                                Month.JANUARY,
                                5),
                                21)


                );
    }



}
