package Overriding_Polymorphism;
/*
Create  a base class Fruit with name ,taste and size as its attributes.

Create a method called eat() which describes the name of the fruit and its taste.

Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.
 */
class Fruit {
    String name, taste, size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println("Taste of " +name + " is " + taste);
    }
}

class Apple extends Fruit {
    Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    void eat() {
        System.out.println("Taste of " +name + " is " + taste);
    }
}

class Orange extends Fruit {
    Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    void eat() {
        System.out.println("Taste of " +name + " is " + taste);
    }
}

public class Assignment7_1{
    public static void main(String[] args) {
        Fruit banana=new Fruit("Banana","sweet","Long");
        Apple apple = new Apple("Apple","Sweet","Round");
        Orange orange = new Orange("Orange","Sour","Round");
        banana.eat();
        apple.eat();
        orange.eat();
    }
}
