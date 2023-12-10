package WEEKsix;

public class Characters {

     //Instances  variable and fields
    // private package  default
private String Name, moveName;
private int movePoint,hitPoint;
int points;
// constructors
// default--> new characters
Characters (String Name, String MoveName){
    this.Name= Name;
    this.moveName = moveName;

}
//setters
public void setName(String moveName){
    this.Name = Name;
    }
public void setMoveName(String MoveName) {
    this.moveName = moveName;
}
public void setHitPoint(String HitPoint) {
    this.hitPoint = hitPoint;
}
    //getter
     public String  getName(){
                return Name;
           }
     public String getMovePoint(){
           return moveName;
           }
     public int getHitPoint(){
           return hitPoint;
           }

}
