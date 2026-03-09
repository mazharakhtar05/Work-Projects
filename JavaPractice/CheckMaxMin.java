package JavaPractice;

import java.util.Scanner;

public class CheckMaxMin {

    static int[] Numbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first_num = sc.nextInt();

        System.out.println("Enter the second number: ");
        int second_num = sc.nextInt();

        System.out.println("Enter the third number: ");
        int third_num = sc.nextInt();

        sc.close();

        return new int[] {first_num , second_num,third_num};

        

    }


    static void Minimum(int a , int b , int c){

        if(a==b && a==c){
            System.out.println("Numbers are equal");
        }
        else if(a<b && a<c){
            System.out.println(a + " is smallest number");
        }
        else if(b<c && b<a){
            System.out.println(b + " is smallest number");

        }
        else{
            System.out.println(c + " is smallest number");
        }
    }

    static void Maximum(int a , int b , int c){

        if(a==b && a==c){
            System.out.println("Numbers are equal");
        }
        else if(a>b && a>c){
            System.out.println(a + " is greatest number");
        }
        else if(b>c && b>a){
            System.out.println(b + " is greatest number");

        }
        else{
            System.out.println(c + " is greatest number");
        }
    }

    public static void main(String[] args) {
        int num[] = Numbers();
        Maximum(num[0], num[1], num[2]);
        Minimum(num[0], num[1], num[2]);
    }
}
