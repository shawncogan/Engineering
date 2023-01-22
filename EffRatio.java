/*
Shawn Cogan
1/21/23
 */
import java.util.Scanner;


 public class EffRatio {

    public static void effRatio(String name, double cost, double maxForce)
    {
        double ratio = (100000/maxForce)/cost;
        System.out.println("Bridge " + name + " statistics: ");
        System.out.println("This bridge costs $" + cost + " and has a maximum force of " + maxForce);
        System.out.printf("The Efficiency Ratio of this bridge is %.4f", ratio);
    }

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("\n\n\n\nPlease input the name of the bridge: ");
    String n1 = scan.nextLine();
    System.out.print("Please input the exact cost of the bridge: \n$");
    double c1 = scan.nextDouble();
    System.out.println("Please input the exact maximum force (decimal less than 1) of the bridge: ");
    double f1 = scan.nextDouble();
    
    effRatio(n1, c1, f1);
 }

}
