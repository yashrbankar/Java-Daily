public class Constructor
{
    public static void main(String args[])
    {
        Dog b=new Dog(0);
    }
};


class animal
{
     animal()
     {
          System.out.println("animal default");
     }
     animal(int val)
     {
          System.out.println("animal parameter ");
     }
};

class Dog extends animal
{
    String color;
    Dog(int x)
    {
       super(x);
       System.out.println("dog default");
    }
};


