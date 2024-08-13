package miscellaneous.instanceofex;// Java Program to Illustrate instanceof Keyword

interface Animal { 
} 

class Cat implements Animal {

	public void meow()
	{
		System.out.println("cat is meowing...");
	}
} 

class Dog implements Animal {
	public void woof()
	{
		System.out.println("dog is barking..");
	}
} 

public class TraditionalInstanceOf {

	public static void resolveTypeOfObject(Animal animal) 
	{ 
		if (animal instanceof Cat) { 
			// Redundant casting 
			Cat cat = (Cat)animal; 
			// other cat operations 
		} 
		else if (animal instanceof Dog) { 
			// Redundant casting 
			Dog dog = (Dog)animal; 
			// other dog operations 
		} 
	} 

	public static void main(String[] args) 
	{ 
		Animal animal = new Dog(); 
		resolveTypeOfObject(animal); 

		animal = new Cat(); 
		resolveTypeOfObject(animal); 
	} 
}
