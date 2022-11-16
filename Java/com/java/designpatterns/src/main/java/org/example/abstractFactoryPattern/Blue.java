package org.example.abstractFactoryPattern;

public class Blue implements Color{

    @Override
    public void fill() {
        System.out.println("实现填充蓝色");
    }
}
