import java.util.Arrays;
import java.util.List;

public class question3 {
	public static void main(String args[])
	{
	Trader raoul = new Trader("Raoul", "Cambridge");
	Trader mario = new Trader("Mario","Milan");
	Trader alan = new Trader("Alan","Cambridge");
	Trader brian = new Trader("Brian","Cambridge");

	List<Transaction> transactions = Arrays.asList(
		new Transaction(brian, 2011, 300),
		new Transaction(raoul, 2012, 1000),
		new Transaction(raoul, 2011, 400),
		new Transaction(mario, 2012, 710),
		new Transaction(mario, 2012, 700),
		new Transaction(alan, 2012, 950)
	      );
	}
}
 class Trader {
	 
    private String name;
    private String city;
    Trader(String name,String city)
    {
    	super();
    	this.name=name;
    	this.city=city;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
 class Transaction {

    private Trader trader;
    private int year;
    private int value;
    
    Transaction(Trader trader,int year,int value)
    {
    	super();
    	this.trader=trader;
    	this.year=year;
    	this.value=value;
    }
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}