class Car{
	int no_of_wheels;
	String brand;
	int cost;
	int no_of_doors;
   	String color;
	public void setNo_of_wheels(int no_of_wheels){
		this.no_of_wheels=no_of_wheels;
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public void setCost(int cost){
		this.cost=cost;
	}
	public void setNo_of_doors(int no_of_doors){
		this.no_of_doors=no_of_doors;
	}
	public void setColor(String color){
		this.color=color;
	}
	public int getNo_of_wheels(){
		return no_of_wheels;
	}
	public String getBrand(){
		return brand;
	}
	public int getCost(){
		return cost;
	}
	public int getNo_of_doors(){
		return no_of_doors;
	}
	public String getColor(){
		return color;
	}
}

public class Encapsulation_Indep_Priv{
	public static void main(String args[]){
		Car c1 = new Car();
		System.out.println("--------before using setters------------");
		System.out.println(c1.getBrand());
		System.out.println(c1.getColor());
		System.out.println(c1.getCost());
		System.out.println(c1.getNo_of_wheels());
		System.out.println(c1.getNo_of_doors());
		c1.setColor("red");
		c1.setBrand("Benz");
		c1.setCost(2500000);
		c1.setNo_of_wheels(4);
		c1.setNo_of_doors(2);
		System.out.println("--------before using getters------------");
		System.out.println(c1.getBrand());
		System.out.println(c1.getColor());
		System.out.println(c1.getCost());
		System.out.println(c1.getNo_of_wheels());
		System.out.println(c1.getNo_of_doors());
	}
}
		
		
		
		