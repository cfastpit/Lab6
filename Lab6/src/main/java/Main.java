
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter land 1 name");
        String land1name = keyboard.next();
        System.out.println("Please enter land 1 length");
        double land1length = keyboard.nextDouble();
        System.out.println("Please enter land 1 width");
        double land1width = keyboard.nextDouble();
        System.out.println("Please enter land 2 name");
        String land2name = keyboard.next();
        System.out.println("Please enter land 2 length");
        double land2length = keyboard.nextDouble();
        System.out.println("Please enter land 2 width");

        double land2width = keyboard.nextDouble();
        LandTract land1 = new LandTract(land1name, land1length, land1width);
        LandTract land2 = new LandTract(land2name, land2length, land2width);
        
        System.out.println(land1name + "Area is " + land1.getArea());
        System.out.println(land1name + "Area is " + land2.getArea());
        
        
         if (land1.equals(land2)) {
            System.out.println(land1name+" and "+land2name+" are equal");
        } else {
            System.out.println(land1name+" and "+land2name+" are not equal");
        }
        System.out.println(land1.toString());
        System.out.println(land2);

    }
}
