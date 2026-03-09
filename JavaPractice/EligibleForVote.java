// A person is eligible to vote if his/her age is greater than or equal to 18. 
// Define a method to find out if he/she is eligible to vote.

package JavaPractice;

import java.util.Scanner;

public class EligibleForVote {

    static void checkEligibility(int age){
        if(age == 0 || age > 100){
            System.out.println("Enter the valid age ");
        }
        else if(age>=18){
            System.out.println("Yes, You are eligible to vote ");
        }
        else{
            System.out.println("No, You are under 18 ");
        }
    }

    static int inputAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age to check are you eligible to vote or not ");
        int age = sc.nextInt();
        sc.close();
        return age;
    }
    
    public static void main(String[] args) {
        int age = inputAge();
        checkEligibility(age);
    }
}
