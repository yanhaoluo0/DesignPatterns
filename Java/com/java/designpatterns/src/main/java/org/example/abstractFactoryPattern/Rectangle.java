package org.example.abstractFactoryPattern;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("实现类：Rectangle 的 draw() ");
    }
}
