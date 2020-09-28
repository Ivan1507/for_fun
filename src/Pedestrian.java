import java.util.Objects;

public class Pedestrian extends  Transport{
    private String Surname;
    private int Age;
    public Pedestrian(String name,String surname, int speed,int age,int lf,Human h) {
        super(name, speed,lf,h);
        Surname=surname;
        Age=age;
    }
    public Pedestrian(String name,int speed,int lf,Human h) {
    	super(name,speed,lf,h);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Surname, Age);
    }

    @Override
    public String toString() {
        return "Pedestrian:"+
                "Surname=" + Surname+
                ", Age=" + Age +
                ", Name=" + Name+
                ", Max_Speed=" + Max_Speed;
    }
}
