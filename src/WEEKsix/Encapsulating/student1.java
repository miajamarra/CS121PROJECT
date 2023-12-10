package WEEKsix.Encapsulating;

public class student1 {

        public String name ;
        public int idNUM;
        public String major;
        double gpa = 3.0;
        boolean isStudent;


        student1(String name, double v){
            this.name = name;
            this.idNUM = idNUM;

        }

    public student1(String) {
    }


    public void student1(String name, int idNUM) {
            this.name = name;
            this.idNUM = idNUM;

        }

        public void student1(String name, int idNUM, String major) {
            this.name = name;
            this.idNUM = idNUM;
            this.major = major;

        }

        private void student1(String name, int idNUM, String major, double gpa) {
            this.name = name;
            this.idNUM = idNUM;
            this.major = major;
            this.gpa = gpa;
            this.isStudent=true;
        }
        public int getidNUM(){return idNUM; }
    public void setIdNUM(int newidNUM) {idNUM= newidNUM;}
    public void setidNUM(int newidNUM, double gpa){
            if (gpa > 4.0){
                idNUM =newidNUM +2;
            }
    }
    public double getGpa(){return gpa;}
    public void setGpa (double gpa){this.gpa=gpa;}

    }



