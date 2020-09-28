public class Car extends Transport {
    public String Model;
    public Car(String name, String model,int speed,int lifting_capacity,Human h) {
        super(name, speed,lifting_capacity,h);
        Model=model;
    }

    @Override
    public String toString() {
        return "Car:" +
                "Model=" + Model +
                ", Name='" + Name +
                ", Max_Speed=" + Max_Speed;
    }
}
