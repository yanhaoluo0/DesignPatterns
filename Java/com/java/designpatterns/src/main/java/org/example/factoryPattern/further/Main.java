package org.example.factoryPattern.further;

public class Main {
    public static void main(String[] args) {
        String type = "1";
        getFunc(type);
        Boolean type2 = true;
        getFunc(type2);
    }

    public static <T> boolean getFunc(T type) {
        FurtherFactory furtherFactory = new FurtherFactory();
        FurtherInterface factory = furtherFactory.createFactory(type);
        return factory.furtherFunc();
    }
}
