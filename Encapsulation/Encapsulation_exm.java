class Vinay{
	private int accno;
	private int pswd;
	
	void setData(int accno,int pswd){
		this.accno=accno;
		this.pswd=pswd;
	}
	void getData(){
		System.out.println(accno);
		System.out.println(pswd);
	}

}
	
class Encapsulation_exm{
	public static void main(String args[]){
		Vinay v=new Vinay();
		
		v.setData(21131161,1923000);
		v.getData();
	}
}
		