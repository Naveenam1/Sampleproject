package Samplesuperkey;

public class A2 extends A1 {

	public  boolean result(int a, int b) {
		
		int divisible=super.sum(a, b);
		
		
		
		if(divisible/10==0)
		{
			return true;
		}
		else 
		{
			return false;
		}
				
		
		
		
			
		

	}
	



public static void main(String args[])
{
	A2 a=new A2();
	a.sum(25, 15);
}
}
