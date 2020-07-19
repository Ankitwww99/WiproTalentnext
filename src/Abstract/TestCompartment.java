/*
Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class.

public abstract String notice();

Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice message that is suitable to the specific type of  compartment.

Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random  number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]
 */

package Abstract;
import java.util.Random;

abstract class Compartment {
    public abstract void notice();
}

class FirstClass extends Compartment {

    @Override
    public void notice() {
        System.out.println("Notice: This is FirstClass");
    }
}

class LadiesClass extends Compartment {

    @Override
    public void notice() {
        System.out.println("Notice: This is LadiesClass");
    }
}

class GeneralClass extends Compartment {

    @Override
    public void notice() {
        System.out.println("Notice: This is GeneralClass");
    }
}

class LuggageClass extends Compartment {

    @Override
    public void notice() {
        System.out.println("Notice: This is LuggageClass");
    }
}



public class TestCompartment{
    public static void main(String[] args) {
        Compartment[] myCompartment=new Compartment[10];

        Random rand = new Random();

        for (int i = 0; i <myCompartment.length ; i++) {
            int randNumber=rand.nextInt(4)+1;
            // it generate number in between 0-3 inclusive to make it 1-4 inclusive plus +1 is used
            if (randNumber == 1)
                myCompartment[i] = new LuggageClass();
            else if (randNumber == 2)
                myCompartment[i] = new LadiesClass();
            else if (randNumber == 3)
                myCompartment[i] = new FirstClass();
            else if (randNumber == 4)
                myCompartment[i] = new GeneralClass();

            myCompartment[i].notice();
        }
    }
}