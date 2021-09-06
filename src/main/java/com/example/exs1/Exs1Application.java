package com.example.exs1;

import com.example.exs1.Model.ModelString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Exs1Application {
    @Autowired
    public Exs1Application(ModelString modelString) {
        this.modelString = modelString;
    }

    public static ModelString modelString;



    public static void main(String[] args) {
        SpringApplication.run(Exs1Application.class, args);

    }

}
