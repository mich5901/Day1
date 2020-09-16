
import java.util.Scanner;


public class DogPark {

    public static void main(String[] args) {
    Dog roger = new Dog(); //roger is an instance of the Dog class
    if(roger instanceof Dog)
            System.out.println("Roger is a dog.");
    
    roger.age = 5;
    roger.breed = "Collie";
    roger.color = "Tan";
    roger.weight = 28;
    roger.name = "Roger";
    
    //make roger do actions
    roger.sayHello();
    roger.bark();
    roger.eat();
    roger.eat();
    roger.bark();
    
    //make bob
    Dog bob;
    Scanner s = new Scanner(System.in);
    bob = new Dog("Terrier", "Suzie", "Black", 10, 2);
    bob.sayHello();
    bob.bark();
    bob.eat();
    }
    
}
