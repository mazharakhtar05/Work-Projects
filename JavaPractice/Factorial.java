// Write a program to print the factorial of a number by defining a method named 'Factorial'.
package JavaPractice;

import java.util.Scanner;

public class Factorial {

    static void  factorial(int num){
        int fact = 1;
        for (int i = 1; i<=num; i++){
            fact = fact*i;
        }

        System.out.println("Factorial of " + num + " is " + fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial: ");
        int num = sc.nextInt();
        factorial(num);
        sc.close();
    }
    
}
