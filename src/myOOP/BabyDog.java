package myOOP;

public class BabyDog extends Dog
{

    public BabyDog()
    {

    }

    public void weep()
    {
        System.out.println("BabyDog is weeping");
    }

    @Override
    public void bark()
    {
        System.out.println("BabyDog is barking");
    }

}
