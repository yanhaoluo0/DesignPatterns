package org.example.factoryPattern.further;

/**
 * 实现该通用方法
 */
public class PersonalImpl2 implements FurtherInterface {
    @Override
    public boolean furtherFunc() {
        System.out.println("further:个性实现2");
        return true;
    }
}
