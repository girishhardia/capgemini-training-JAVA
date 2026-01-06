// Q1. Write a Java program to create a class called Person with private instance variables name, age. and country. 
//Provide public getter and setter methods to access and modify these variables.
// ------------------------------------------------------------------------------------------

public class Person1{
	private String name ;
	private int age; 
	private String country;

	public Person1(String name, int age, String country){
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public String getName(){
		return this.name;

	}

	public int getAge(){
		return this.age;
		

	}

	public String getCountry(){
		return this.country;

	}


}
