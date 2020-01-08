package io.ascending.training.interfaceExercise;

public interface DefaultAndStaticInterface {

    static void printSomething_1(){
        System.out.println("Print something in print method one");
    }

    default void printSomething_2(){
        System.out.println("Default print");
    }
}
