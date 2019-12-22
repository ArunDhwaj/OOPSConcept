import myOOP.*;

public class Driver
{
    public static void main(String[] args)
    {
        //1) Checking Inheritance Concept
        //inheritance();

        //2) Checking Overriding Concept
        //overriding();

        //3) Checking PolymorphismMethods Concept
        //polymorphismMethods();

        //4) Checking AbstractMethods Concept
        //abstractMethods();

        //5) Checking Encapsulation Concept
        encapsulation();

        //6) Checking Interfaces Concept
        interfaces();
    }

    private static void inheritance()
    {
        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
    }

    private static void overriding()
    {
        BabyDog babyDog = new BabyDog();
        babyDog.bark();
    }

    private static void polymorphismMethods()
    {
        BabyDog babyDog = new BabyDog();

        babyDog.bark();
        babyDog.bark("Loudly", "Slowly");
    }

    private static void abstractMethods()
    {
        Animal animal = new Animal();
        animal.sound();
        animal.legs();
    }

    private static void encapsulation()
    {
        Animal animal = new Animal();
        animal.setAnimalName("Puppy");
        animal.setAnimalAge(5);
        animal.setColor("Brown");

        System.out.printf("Animal Name: %s, Animal Age: %d, Animal Color: %s \n", animal.getAnimalName(), animal.getAnimalAge(), animal.getColor() );
    }

    private static void interfaces()
    {

    }

}
