
public class Dog {
    
    //define properties
    String breed;
    int weight;
    String color;
    int age;
    String name;
    
    //constructor method to assign properties
    //always starts with name of the class
    Dog(String b, String n, String c, int w, int a){
    breed = b;
    name = n;
    color = c;
    weight = w;
    age = a;
    }
    Dog(){
        
    }
    
    //define the abilities
    //use methods to represent what a dog can do
    public void bark(){
        if(weight>=30)
        System.out.println(name + " goes woof!");
        else 
        System.out.println(name + " goes yip!");
    }
    public void eat(){
        System.out.println(name + " has a snack.");
        weight++;
        System.out.println(name + " now weighs " + weight + "lbs.");
    }
    public void sayHello(){
        System.out.println("This is " + name + " the " + breed + ".");
    }
}
