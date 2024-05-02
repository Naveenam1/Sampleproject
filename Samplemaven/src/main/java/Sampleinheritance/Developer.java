package Sampleinheritance;

public class Developer extends Employee {
	
	int Developerage= 29;

	public void display()
	
	{
		System.out.println("age of developer");

	}
	
	public static void main(String args[])
	{
		
		Developer obj=new Developer();
		obj.display();
		obj.print();
		
		Tester obj1=new Tester();
		obj1.show();
	}

}
