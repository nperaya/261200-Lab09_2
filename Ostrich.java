package oop.lsp;


//Ostrich บินไม่ได้
//implement Moveable เท่านั้น

public class Ostrich implements Moveable {

    @Override
    public void move() {
        System.out.println("Ostrich runs very fast.");
    }
}
