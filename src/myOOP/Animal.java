package myOOP;

public class Animal extends MainAnimal
{
    private String animalName;

    private int animalAge;

    private String color;

    public Animal()
    {

    }

    public void eat()
    {
        System.out.println("eating...");
    }

    public void sound()
    {
        System.out.println("Dog Woof");
    }

    public void legs()
    {
        System.out.printf("Goat has four legs");
    }

    public String getAnimalName()
    {
        return animalName;
    }

    public int getAnimalAge()
    {
        return animalAge;
    }

    public String getColor()
    {
        return color;
    }

    public void setAnimalName(String animalName)
    {
        this.animalName = animalName;
    }

    public void setAnimalAge(int animalAge)
    {
        this.animalAge = animalAge;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
}
