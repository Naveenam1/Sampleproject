package Samplesuperkey;

public class Dog extends Animal{
	String color="Black";

	public void eat() {
		super.eat();
		
		
    System.out.println("Dog's color :"+color + "" +super.color);
	}
	
	public Dog()
	{
		super();
		System.out.println("Dog constructor");
	}
	
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.eat();
	}

}
