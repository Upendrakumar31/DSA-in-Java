package FunctionsAndMethod;

import java.util.Scanner;

public class avgOf3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        double x = sc.nextDouble();
        System.out.print("Enter the second number :");
        double y = sc.nextDouble();
        System.out.print("Enter the third number :");
        double z = sc.nextDouble();
        System.out.print("average of 3 numbers is = " + average( x, y, z) + "\n");
    }
    public static double average(double x , double y , double z){
        return (x + y + z)/3;
    }
}
