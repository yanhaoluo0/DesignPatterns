package org.example.factoryPattern.easy;

public class PersonalImpl1 implements CommonInterface {
    @Override
    public boolean commonFunc() {
        System.out.println("个性实现1");
        return false;
    }
}
