class Calculator{
	int add(int a, int b){
		int c=a+b;
		return c;
	}
	
	int add(int a, int b, int c){
		int d= a+b+c;
		return d;
	}
	float add(float a,float b){
		float c = a+b;
		return  c;
	}
}
public class MethodOverloading{
	public static void main(String args[]){
		Calculator cal = new Calculator();
		System.out.println(cal.add(10,200));
		System.out.println(cal.add(10,20,30));
		System.out.println(cal.add(10.69f, 30.92f));
	}
}
