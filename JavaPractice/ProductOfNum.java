// Define a method that returns the product of two numbers entered by user.

package JavaPractice;

import java.util.Scanner;

public class ProductOfNum {

    static void productOfNum(int a , int b){
        int product = (a*b );
        System.out.println("Product: " + product);


    }

    static int[] inputNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num01: ");
        int a = sc.nextInt();
        System.out.println("Enter the num02: ");
        int b = sc.nextInt();
        sc.close();
        return new int[] {a,b};
    }
    public static void main(String[] args) {
        int num[] = inputNum();
        productOfNum(num[0],num[1]);
    }
}
