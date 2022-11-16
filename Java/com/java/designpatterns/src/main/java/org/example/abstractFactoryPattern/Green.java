package org.example.abstractFactoryPattern;

public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("实现填充绿色");
    }
}
