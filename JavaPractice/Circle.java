// Write a program to print the circumference and area of a circle of radius 
// entered by user by defining your own method.

package JavaPractice;

import java.util.Scanner;

public class Circle {

    static void Area(double r){
        double area = 3.14 * (r*r);
        System.out.println("Area : " + area);
    }

    static void circumference(double r){
        double circum = ( 2 * 3.14 * r);
        System.out.println("Circumference: " + circum);

    }

    static double inputRadius(){
        System.out.println("Enter the radius of the circle: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        sc.close();

        return radius;
    }

    public static void main(String[] args) {
        double r = inputRadius();
        Area(r);
        circumference(r);

    }
}
