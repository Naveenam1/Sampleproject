package Sampleinheritance;

public class Babydog extends Dog {
	
	String name="Jikki";
	
	public void display()
	{
		System.out.println("Dogs name :" + name);
	}

	public static void main(String[] args) {
		
		Babydog obj=new Babydog();
		obj.print();
		obj.display();
		obj.eat();

	}

}
