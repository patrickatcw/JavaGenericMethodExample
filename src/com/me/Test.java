package com.me;

public class Test {

    //generic method
    static <T> void genericDisplay (T element) {

        System.out.println(element.getClass().getName() + " = " + element);

    }

}
