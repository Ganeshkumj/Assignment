
public class question4 {
public static void main(String args[])
{
	Fruit f1=new Fruit("one",12323,2424,"green");
}
}
 class Fruit { 
	 
    public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	private String name; 
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	private int calories; 
    private int price; 
    private String color; 

     // Add constructors, setter, getter and toString() methods
}