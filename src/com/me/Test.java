package com.me;

public class Test {

    // A Generic method example
    static <T> void genericDisplay (T element) {

        System.out.println(element.getClass().getName() + " = " + element);

    }

}
