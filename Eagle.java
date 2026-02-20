package oop.lsp;


public class Eagle implements Flyable {

    @Override
    public void move() {
        System.out.println("Eagle walks powerfully.");
    }

    @Override
    public void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}
