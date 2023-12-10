package WEEKthree;

import java.net.SocketPermission;

public class conditions {

    public static void main(String[] args) {

        /*
         * Conditional Statements:
         * - if statements
         * - else-if statements
         * - else statements
         * - switch statements
         * */

        int age;
        double gpa;
        //0.0
        char letterGrade;
        boolean csMajor, isStudent;
        String name;

        age = 20;
        name = "Mia";
        letterGrade = 'A';
        isStudent = true;
        csMajor = true;
        gpa = 1.1;
        if (age <= 21) {
            System.out.println("You are younger than 21.\n");
        } else {
            System.out.println("you are older than 21.\n");
        }
        if (gpa >= 4.0) {
            System.out.println("You receive an A.");
        } else if (gpa >= 3.6) {
            System.out.println("You receive an A -----");
        } else if (gpa >= 2.7) {
            System.out.println("you receive a B.");
        } else if (gpa >= 1.7) {
            System.out.println(" you receive a C");
        } else {
            System.out.println("you receive below a C.");
        }


// relational
// operator
//<,>,<=,>=,==,!=(not equal)
//string x = "helen"
//string y = "helen"

// .equals()--> for strings  ( use for not equals for strings -->)!x.equals(y)
        if (csMajor == isStudent) {
            System.out.print("This person is a student a cs major.\n" );
        } else{
            System.out.println("One value for the student for cs major is false.");
        }

        String name2 = "MiaLacey";
        if(!name.equals(name2)){
            System.out.printf("The name %s is  not equal to the name2 %s \n" , name, name2);
        }else{
            System.out.println("The names are  equal...");
        }
    }
}
/*
        if(condition){
            // executes  code  if condition is  true;
        }
        // else statement
        if(condition){
            // executes code  if condition is true
        }else {
            // executes  code if condition is false
        }
       // if-else- if statements
        if (condition1) {
            // execute if code condition1  is true
        } else if (condition2) {
            // execute if code condition2 is true
}
        else if (condition3){
        // executes code if condition 3 is true

        else{
        // executes code if the conditions above are not met.
         int num= 11;
         String result = ( num %2 ==0) "Even" : "Odd";
        // System.out.println( "The number is : " + result902);
             int num=11;
             String result = ( num % 2 ==0) "Even" : "Odd";
             System.out.println(" The number is : " + result);

            }
        //}*/