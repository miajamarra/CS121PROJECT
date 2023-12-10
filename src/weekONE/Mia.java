package weekONE;

public class Mia {
    public static void main(String[] args) {

        int age;
        double gpa;
        //0.0
        char letterGrade;
        boolean csMajor;
        String name;

        age = 1;
        name = "Mia";
        letterGrade = 'A';
        csMajor = true;
        gpa = 3.4;


        String favoriteColor ="naruto";
        System.out.println("Mia is 20, her letterGrade is A");
        System.out.printf("my name is %s \n",name);
        System.out.print("Mia is csMajor");
        System.out.printf("MY AGE IS :%d",age);
        System.out.printf("MY GPA IS : %.2f",gpa);
        System.out.printf("You are a cs  Major %b%n",csMajor);
        System.out.printf("my letterGrade is : %c",letterGrade);
    }
}
