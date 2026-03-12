<<<<<<< HEAD
package JavaPractice;
=======

>>>>>>> 50d7dc5b2fe3c288e7ca78e5049d0b007631553e
/*
Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 
*/

import java.util.Scanner;



public class Grade {
    static int inputMarks(){
        System.out.println("Enter Your Marks (out of 100 )");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        sc.close();
        return marks;
    }
    
    static void grade(int num){
        if(num>=91 && num<=100){
            System.out.println("AA");
            return;
        }
        else if(num>=81 && num<=90){
            System.out.println("AB");
            return;
        }
        else if(num>=71 && num<=80){
            System.out.println("BB");
            return;
        }
        else if(num>=61 && num<=70){
            System.out.println("BC");
            return;
        }
        else if(num>=51 && num<=60){
            System.out.println("CD");
            return;
        }
        else if(num>=41 && num<=50){
            System.out.println("DD");
            return;
        }
        else if(num<=40){
            System.out.println("FAIL");
            return;
        }
        
        else{
            System.out.println("Enter the valid number");
        }
    }
    
        
    public static void main(String[] args) {
        
        int marks = inputMarks();
        grade(marks);
        
    }
}
