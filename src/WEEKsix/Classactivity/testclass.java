package WEEKsix.Classactivity;

public class testclass {
    public static void main(String[] args) {
        Narutocharacters  narutocharacters = new Narutocharacters("Naruto", "Madara", "ninjutsu", 6.0);
        System.out.printf("narutohero:%s%n", narutocharacters.narutohero);
        System.out.printf("narutovillian: %s%n",narutocharacters.narutovillian);
        System.out.printf("narutopower: %s%n",narutocharacters.narutopower);
        System.out.printf("attackspeed: %s%n",narutocharacters.attackspeed);

        students Students = new students( "Mia Lacey","8077231", "computer science", 3.0);
        System.out.printf("name: %s%n", Students.name);
        System.out.printf("idNUM: %s%n", Students.idNUM);
        System.out.printf("major: %s%n", Students.major);
        System.out.printf("gpa: %s%n", Students.gpa);


    }
}
