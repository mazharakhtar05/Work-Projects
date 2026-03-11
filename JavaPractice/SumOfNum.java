// Write a program to print the sum of two numbers entered by user by defining your own method.

package JavaPractice;

import java.util.Scanner;

public class SumOfNum {

    static void sumOfNumber(int a , int b){
        int sum = (a+b);
        System.out.println("Sum : " + sum);

    }

    static int[] inputNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num01: ");
        int num01 = sc.nextInt();
        System.out.println("Enter the num02: ");
        int num02 = sc.nextInt();
        sc.close();
        return new int[] {num01,num02};
    }

    public static void main(String[] args) {

        int num[] = inputNum();
        sumOfNumber(num[0], num[1]);
        
    }
}
