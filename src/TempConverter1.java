
import java.util.Scanner;


public class TempConverter1 {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double cel, far;
        System.out.print("Enter degrees in Farenheit >> ");
        far = s.nextDouble();
        cel = (far-32) * 5/9;
        System.out.println(String.format("%.1f F - %.1f C", far, cel));
    }
    
}
