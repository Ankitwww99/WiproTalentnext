package Classes_and_Objects;
/*
 Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
 The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box.
 Create an object of the Box class and test the functionalities.
 */
class Box{
    double width, height, depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume(){
        double vol=width*height*depth;
        return vol;
    }
}
public class Assignment4_1 {
    public static void main(String[] args) {
        Box mybox= new Box(23,65,67);
        System.out.println(mybox.volume());
    }
}
