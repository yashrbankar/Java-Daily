
class Inheritance
{
    public static void main(String args[])
    {
        Fish horse=new Fish();
        horse.fins=2;
        horse.eat();
        horse.color="red";
        horse.breathe();
    }
};


class Animal 
{
    public String color;
    void eat()
    {
         System.out.println("eats");
    }
    
    void breathe()
    {
         System.out.println("B");
    }
};

class Fish extends Animal
{
     int fins;
     String type;
};


