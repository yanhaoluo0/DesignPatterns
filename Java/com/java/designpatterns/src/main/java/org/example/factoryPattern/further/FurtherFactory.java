package org.example.factoryPattern.further;

import org.example.factoryPattern.further.FurtherInterface;
import org.example.factoryPattern.further.PersonalImpl1;
import org.example.factoryPattern.further.PersonalImpl2;

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
