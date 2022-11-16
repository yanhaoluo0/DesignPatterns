package org.example.factoryPattern.further;

public class FurtherFactory {

    public <T>FurtherInterface createFactory(T type) {
        if (type instanceof String) {
            return new PersonalImpl1();
        } else if (type instanceof Boolean) {
            return new PersonalImpl2();
        }
        return null;
    }
}
