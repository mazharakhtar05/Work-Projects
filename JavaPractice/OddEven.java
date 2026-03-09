package JavaPractice;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        checkNumber(num);
        sc.close();
    }

    static void checkNumber(int num){
        if(num == 0 || num==1){
            System.out.println(num +" IS ODD NUMBER");
        }
        else if(num%2==0){
            System.out.println(num + " IS EVEN NUMBER");
        }
        else{
            System.out.println(num + " IS ODD NUMBER" );
        }
    }
}