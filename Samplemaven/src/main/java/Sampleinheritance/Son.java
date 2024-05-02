package Sampleinheritance;

public class Son extends Father {
	
	String sonname="John";

	public void show() {
		System.out.println("Son's name: " +sonname);
		
	}
	
	public static void main(String args[])
	
	{
		Son obj=new Son();
		obj.print();
		obj.display();
		obj.show();
		
		Daughter obj1=new Daughter();
		obj1.child();
	}

}
