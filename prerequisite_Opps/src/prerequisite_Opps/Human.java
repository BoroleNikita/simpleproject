package prerequisite_Opps;

public class Human {
	String name;
	int age;
	int heightInInches;
	String EyeColor;
	
	public Human() 
	{
		
		name = "Nikita";
		age = 23;
		heightInInches = 72;
		EyeColor = "blue";
		
	}
	
	public Human(String name, int age, int heightInInches, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		EyeColor = eyeColor;
	}

	
	public void speak()
	{
		System.out.println("hello, my name is " + name);
		System.out.println("I am "+age +" year old");
		System.out.println("i am "+ heightInInches +" inches tall");
		System.out.println("my EyeColor is "+ EyeColor);
		
	}
	
	public void eat()
	{
		System.out.println("eating......");
	}
	
	public void walk() 
	{
		System.out.println("Walking...");
	}

}
