package oop.lsp;

import java.util.ArrayList;
import java.util.List;

public class Lab09_2 {

    public static void main(String[] args) {

        // สร้าง object ของนกแต่ละชนิด
        Moveable sparrow = new Sparrow();
        Moveable eagle = new Eagle();
        Moveable penguin = new Penguin();
        Moveable ostrich = new Ostrich();

        // เก็บไว้ใน polymorphic collection
        List<Moveable> birds = new ArrayList<>();
        birds.add(sparrow);
        birds.add(eagle);
        birds.add(penguin);
        birds.add(ostrich);

        // เรียก move() ได้กับนกทุกตัว
        System.out.println("_____ Moving Birds _____");
        for (Moveable bird : birds) {
            bird.move();
        }

        // ทดสอบ Flyable
        System.out.println("\n_____ Flying Birds _____");
        Flyable flyingBird1 = new Sparrow();
        Flyable flyingBird2 = new Eagle();

        flyingBird1.fly();
        flyingBird2.fly();


         //ทุก Flyable เป็น Moveable ได้
        //ไม่มีนกที่บินไม่ได้ถูกบังคับให้ implement fly()


    }
}
