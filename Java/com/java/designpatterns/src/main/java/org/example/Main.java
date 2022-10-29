package org.example;

import org.example.prototype.Sheep;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        List<String> stu=new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            stu.add(String.valueOf(new Random().nextInt()));
        }


        filterNumber(stu);
    }

    private static void filterNumber(List<String> stu) {
        List<String> collect = stu.stream().filter(s -> s.hashCode() > 100).collect(Collectors.toList());
    }
}