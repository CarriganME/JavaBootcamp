//Created by: Mike Carrigan
//Create dog objects with name and age
public class Dog {
	private String name;
	private int age;
	private final int PERSON = 7;
	
	public Dog (String dogName, int dogAge) {  //initializes the dog object
		name = dogName;
		age = dogAge;
	}
	
	public String getName(){  //Returns the name of the dog
		return name;
	}
	
	public int getAge() {  //Returns the age of the dog
		return age;
	}
	
	public void setAge(int newAge) {   //Sets the age of the dog
		age = newAge;
	}
	
	public int personAge() {	//Returns the age of the dog in human years
		return age * PERSON;
	}
	
	public String toString(){	//toString method for Dog class
		return "Dog " + name + " is " + age + " years old.";
	}
	
}