package Inheritance;
/*
Create a class named ‘Animal’ which includes methods like eat() and sleep().

Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().

Create an instance of Animal class and invoke the eat and sleep methods using this object.

Create an instance of Bird class and invoke the eat, sleep and fly methods using this object

 */
class Animal{
    public void eat () {
        System.out.println("Animals eat food");
    }

    public void sleep () {
        System.out.println("Animals sleep's");
    }
}
class Bird extends Animal {

    @Override
    public void eat () {
        System.out.println("Birds eat food");
    }

    @Override
    public void sleep () {
        System.out.println("Birds sleep's");
    }

    public void fly () {
        System.out.println("Birds can fly");
    }
}
public class Assignment6_1 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.eat();
        myAnimal.sleep();

        Bird myBird = new Bird();
        myBird.eat();
        myBird.sleep();
        myBird.fly();
    }
}
