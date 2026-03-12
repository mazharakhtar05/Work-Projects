// Define a method to find out if a number is prime or not.

package JavaPractice;

import java.util.Scanner;

public class CheckPrime {

    static void checkPrime(int num){

        if(num<=1){
            System.out.println("Not Prime ");
            return;
        } 
       
        for (int i = 2; i < num; i++) {
            if(num%i == 0){
                System.out.println(num + " Not Prime ");
                return;
            }
                
        }

        
        System.out.println(num + " Prime ");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime: ");
        int num = sc.nextInt();
        checkPrime(num);
        sc.close();
    
    }
    
}
