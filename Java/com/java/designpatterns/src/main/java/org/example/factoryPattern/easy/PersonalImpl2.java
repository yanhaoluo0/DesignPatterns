package org.example.factoryPattern.easy;

/**
 * 实现该通用方法
 */
public class PersonalImpl2 implements CommonInterface{
    @Override
    public boolean commonFunc() {
        System.out.println("个性实现2");
        return true;
    }
}
