package org.example.abstractFactoryPattern;

public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("实现填充红色");
    }
}
