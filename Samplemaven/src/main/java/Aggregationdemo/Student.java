package Aggregationdemo;

public class Student {
	
	String name;
	int age;
	Address ad; //aggregation

	public Student (String name , int age ,Address ad) {
		
		
		this.name=name;
		this.age=age;
		this.ad=ad;
	}


public void display()
{
	System.out.println("Name is :"  + name);
	System.out.println("Age is :" + age);
	System.out.println("house num is :" + ad.hnum);
	System.out.println("Pin is :" + ad.pin);
	System.out.println("Street name is :" + ad.street);
}

public static void main(String args[])
{
	Address add=new Address(206,670307,"Sreebhavanam","NM");
	Student std=new Student("Arun",23,add);// add -- object of address
	std.display();
}
}