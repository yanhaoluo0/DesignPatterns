package org.example.factoryPattern.easy;

public class Factory {

    public CommonInterface createFactory(String type) {
        if ("1".equals(type)) {
            return new PersonalImpl1();
        } else if ("2".equals(type)) {
            return new PersonalImpl2();
        }
        return null;
    }
}
