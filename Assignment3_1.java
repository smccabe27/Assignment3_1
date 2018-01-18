import java.util.Scanner;

public class Quadratic {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value for a");
        double a = scan.nextDouble();
        System.out.println("Enter value for b");
        double b = scan.nextDouble();
        System.out.println("Enter value for c");
        double c = scan.nextDouble();
        
        double discriminant = (b*b)-(4*a*c);
        double root1 = 0;
        double root2 = 0;
        int roots = 0;
        if(discriminant >= 0){
            roots++;
            if(discriminant > 0){
                roots++;
                root2 = ((-b + Math.pow(discriminant,.5))/(2*a));
            }
            root1 = ((-b - Math.pow(discriminant,.5))/(2*a));
        }
        System.out.println("The equation has " + roots + " real roots");
        if(roots >= 1 ){
            System.out.println("The first root is " + root1);
        }
        if(roots == 2){
            System.out.println("The second root is " + root2);
        }
    }
}