
public class ThisEx {
	String country;
	String capital;
	int population;
	
	public ThisEx() {
		this.country = "France";
		this.capital = "paris";
		this.population = 10;
	}
	
	public ThisEx(String capital, int population) {
		this("UK", capital, population);
	}
	
	public ThisEx(String country, String capital, int population) {
		this.country = country;
		this.capital = capital;
		this.population = population;
	}
	
	@Override
	public String toString() {
		return "country: " + this.country + ", capital: " 
	+ this.capital + ", population: " + this.population;
	}
	
	public static void main(String[] args) {
		ThisEx c1 = new ThisEx();
		System.out.println(c1);
		
		ThisEx c2 = new ThisEx("Italy", "Rome", 20);
		System.out.println(c2);
		
		ThisEx c3 = new ThisEx("London", 15);
		System.out.println(c3);
	}
 }
