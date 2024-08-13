package miscellaneous.instanceofex;

/*
The pattern matching for instanceof operator eliminates the boilerplate code
to type check and cast to a variable.
 */

// Java Program to Illustrate Pattern matching for
// instanceof Keyword

public class PatternMatchingInstanceOf {

    public static void resolveTypeOfObject(Animal animal)
    {
        if (animal instanceof Cat cat) {
            cat.meow();
            // other cat operations
        }
        else if (animal instanceof Dog dog) {
            dog.woof();
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



