public class Demonstrate {
    public static void main(String[] args){
    	Point p=new Point("Wkola123",23,45);
    	Human Ivan=new Human("Razinkin Ivan Igrorevich",21,p);
    	System.out.println(Ivan);
    	Point p1=new Point("Obwaga",15,10);
    	Customer Sanya=new Customer("Piskarev A.A",21,p1,5);
    	Product Pizza=new Product("Pizza",1,1,2,3);
    	Product Kola_kola=new Product("Koka-cola",1,2,2,2);
    	Sanya.add_Product(Pizza);
    	Sanya.add_Product(Kola_kola);
    	Sanya.Print_Goods();
        Pedestrian ped=new Pedestrian("Иван",12,21,Ivan);
        System.out.println(ped);
        Bicycle zubr=new Bicycle("Zubr","Pegas",40,30,Ivan);
        System.out.println(zubr);
        System.out.println(zubr.hashCode());
        System.out.println("=====");
        Point MIET=new Point("MIET",0,10);
        Point Krukovo=new Point("Krukovo",10,0);
        System.out.println(MIET);
        Road Miet_Krukovo=new Road(MIET,Krukovo);
        System.out.println(Miet_Krukovo);
        Bus bs=new Bus("Audi","A112",80,1000,Ivan);
        Bus bs1=new Bus("Audi","A112",80,1000,Ivan);
        System.out.println(bs.equals(bs1));
        Quadcopter Aue=new Quadcopter("Qudro","19901A",120,10,Ivan);
        System.out.println(Aue);
    }
}
