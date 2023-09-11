package org.example.sample;

import org.example.regular.OtherClass;
import org.example.regular.Decorator;

public class Main {

    public static void main(String[] args) {
        int result = OtherClass.add(2,2);
        System.out.println(Decorator.decorator(result));
        result = OtherClass.sub(2,2);
        System.out.println(Decorator.decorator(result));
        result = OtherClass.mul(2,2);
        System.out.println(Decorator.decorator(result));
        result = OtherClass.div(2,2);
        System.out.println(Decorator.decorator(result));
    }

}
