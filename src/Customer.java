import java.util.ArrayList;

public class Customer extends Human{
private ArrayList<Product> Goods=new ArrayList<>();
private double Time_delivery;
public Customer(String fio,int old,Point location,double time_delivery) {
super(fio,old,location);
Time_delivery=time_delivery;
}
public void add_Product(Product good) {
	Goods.add(good);
	System.out.println("Добавлен товар в ваш список заказов:"+good);
}
public void Print_Goods() {
	 System.out.println("Ваш списко заказов:");
	 for (Product A : Goods) {
		 System.out.println(A);
	 }
}

}
