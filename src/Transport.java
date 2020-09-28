public abstract class Transport {
    protected String Name;
    protected  int Max_Speed;
    protected int Lifting_capacity;
    protected Human Driver;
    public Transport(String name,int speed,int lifting_capacity,Human driver){
        Name=name;
        Max_Speed=speed;
        Lifting_capacity=lifting_capacity;
        Driver=driver;
    }
    @Override
    public String toString() {
        return "Transport " +
                "Name=" + Name+
                ", Max_Speed=" + Max_Speed+",Driver"+Driver;
    }
}
