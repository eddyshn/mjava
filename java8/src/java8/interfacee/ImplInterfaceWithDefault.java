package java8.interfacee;

interface InterfaceWithDefault {
    void firstMethod();
    default void newMethod() {
        System.out.println("newMethod");
    }
}

public class ImplInterfaceWithDefault implements InterfaceWithDefault {

    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }
}