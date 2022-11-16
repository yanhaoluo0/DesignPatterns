package org.example.abstractFactoryPattern;

public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("实现类：Circle 的 draw() ");
    }
}
