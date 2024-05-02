package Accessmodifier1;

public class Access1 {
	
	public static void main(String args[])
	{
		Access1 a1= new Access1();
		a1.display();
	}
	
	 protected int num=1;

	protected  void display() {
		
		System.out.println("Num is : " +num);

	}

}
