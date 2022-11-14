package org.example.factoryPattern.easy;

/**
 * 工厂模式
 * ①创建一个通用接口，然后多方法实现该通用接口
 * ②创建工厂类（该类用于匹配具体的内容），但是返回接口
 * ③使用：创建该工厂，再调用具体方法时为相关实现方案
 */
public class Main {

    public static void main(String[] args) {
        String type="1";
        getFunc(type);
    }


    public static boolean getFunc(String type){
        CommonInterface factory = new Factory().createFactory(type);
       return factory.commonFunc();
    }
}
