// this is concept of overridding 
// polymorphism


public  class obj1obj2
{
   public static void main(String args[])
   {
       Animal Doggy= new Dog();
       Doggy.eating();
   }
}


class Animal
{
    protected int legs;
    void eating()
    {
        System.out.println("speed");
    }
}

class Dog extends Animal
{
    int height;
    void eating()
    {
         System.out.println("eating");
    }
}
