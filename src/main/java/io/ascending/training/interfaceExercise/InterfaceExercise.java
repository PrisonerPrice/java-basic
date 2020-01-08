package io.ascending.training.interfaceExercise;

public class InterfaceExercise {

    public static void main(String[] args) {

        // static method in interface
        DefaultAndStaticInterface.printSomething_1();

        // default method in interface, no implementation
        DefaultAndStaticInterface defaultAndStaticInterface = new DefaultAndStaticInterface() {};
        defaultAndStaticInterface.printSomething_2();

        // default method in interface, with implementation
        DefaultAndStaticInterface defaultAndStaticInterface2 = new DefaultAndStaticInterface() {
            @Override
            public void printSomething_2() {
                System.out.println("Implemented print");
            }
        };
        defaultAndStaticInterface2.printSomething_2();

        // Functional interface
        MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterface() {
            @Override
            public void doSomething() {
                System.out.println("I am in a Functional Interface");
            }
        };
        myFunctionalInterface.doSomething();

        // Functional interface, with lambda
        MyFunctionalInterface myFunctionalInterface2 = () -> System.out.println("I am in a Functional Interface, with lambda");
        myFunctionalInterface2.doSomething();
    }
}
