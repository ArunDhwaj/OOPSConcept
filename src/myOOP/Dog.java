package myOOP;

public class Dog extends Animal
{
    public Dog()
    {

    }

    public void bark()
    {
        System.out.println("Dog is barking");
    }

    public void bark(String l, String s)
    {
       // System.out.println("The Dog is barking " + l + " and  " + s);

        System.out.printf("The Dog is barking %s and %s \n", l, s );
    }
}

