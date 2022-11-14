package org.example.factoryPattern.further;

/**
 * 工厂模式
 * ①创建一个通用接口，然后多方法实现该通用接口
 * ②创建工厂类（该类用于匹配具体的内容），但是返回接口
 * ③使用：创建该工厂，再调用具体方法时为相关实现方案
 *
 * 根据不同类型返回对应的处理方法
 */
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
