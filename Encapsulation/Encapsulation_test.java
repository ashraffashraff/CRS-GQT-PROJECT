class Vinay{
	/*
	int accno;
	int pswd;
	
	void setData(int accno,int pswd){
		this.accno=accno;
		this.pswd=pswd;
	}
	void getData(){
		System.out.println(accno);
		System.out.println(pswd);
	}*/
	int accno=112;
	int pswd=16;
	void display1(){
		System.out.println(accno);
		System.out.println(pswd);
	}
}
class Rohan extends Vinay{
	void change(){
		accno = 1102;
		pswd = 616;
	}
	void disp(){
		System.out.println("the changed rohan"+accno);
		System.out.println("the changed roh_pswd"+pswd);
	}
}	
class Encapsulation_test{
	public static void main(String args[]){
		Vinay v=new Vinay();
		Rohan r= new Rohan();
		//v.setData(21131161,1923000);
		//v.getData();
		r.change();	
		v.display1();
		r.disp();
		
	}
}
		