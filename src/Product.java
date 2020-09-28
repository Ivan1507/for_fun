
public class Product {
	private String Name;
	private double Weight;
	private double Height;
	private double Width;
	private double Length;
	
	public Product( String name, double weight, double h, double w, double l) {
		this.Name = name;
		this.Weight = weight;
		this.Height = h;
		this.Width = w;
		this.Length = 0;
	}
	public Product() {
		this("",0,0,0,0);
	}
	@Override
	public String toString() {
		return "Product:"+Name+",Weight="
				+Weight+",Height="+Height+
				",Width="+Width+",Length="+Length;
	}
	
}
