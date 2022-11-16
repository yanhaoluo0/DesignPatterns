package org.example.abstractFactoryPattern;

public class Square  implements Shape{
    @Override
    public void draw() {
        System.out.println("实现类：Square 的 draw() ");
    }
}
