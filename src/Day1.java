
import java.util.Scanner;


public class Day1 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int age; 
        System.out.print("Enter your age > ");
        age = s.nextInt();
        age+=10;
        System.out.println("In 10 years, you will be " + age + " years old.");
    }
    
}
