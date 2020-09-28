
public class Human {

	
	private String FIO;
	private int Old;
	private Point Location;
	Human(){
		FIO = "";
		Old = 0;
	}
	
	Human(String fio, int old, Point location){
		this.FIO = fio;
		this.Old = old;
		this.Location = location;
	}
	@Override 
	public String toString() {
		return "Human ( FIO="+ this.FIO + ", OLD = " + Old + ", Location = " + Location + ")"; 
	}
}
