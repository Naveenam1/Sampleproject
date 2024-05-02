package Sampleinheritance;

public class Bike extends Vehicle {
	
	int registernumber= 2121;
	
	public void print()
	{
		System.out.println("Bike reg no" +registernumber );
		System.out.println(speed);
		
	}
	public static void main(String[] args) {
		
		Bike obj=new Bike();
		obj.display();
		obj.print();
		
		}

}
