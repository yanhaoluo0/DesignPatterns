package org.example.factoryPattern.further;

public class PersonalImpl1 implements FurtherInterface {
    @Override
    public boolean furtherFunc() {
        System.out.println("further:个性实现1");
        return false;
    }
}
