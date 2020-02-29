package io.marmot.learning.ch01;

public interface Parent {

    void message(String body);

    default void welcome(){
        message("Hello!");
    }

    static  void say(){
        System.out.println("11111");
    }
}
