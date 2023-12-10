package WEEKsix.Encapsulating;

public class Students {
     public String name;
     int idNUM;
     public String major;
     double gpa;
     boolean isgradstudent;

     public Students(String name){
         this.name = name;
     }
     private Students(String major, double gpa){
         this.major = major;
         this.gpa=gpa;

     }
     public Students(String name, int idNUM, Double gpa){
         this.name = name;
         this.idNUM= idNUM;
         this.gpa = gpa;

     }
     private Students(String name, int idNUM, String major){
         this.name = name;
         this.idNUM= idNUM;
         this.major =major;


     }
    Students(String name, int idNUM, String major, double gpa){
        this.name = name;
        this.idNUM= idNUM;
        this.major =major;
        this.gpa=gpa;
        this.isgradstudent= true;


}

    public Students(String miaLacey, String number, String computerScience, double gpa) {
    }
}
