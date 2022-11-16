
public class interface1
{
    public static void main(String args[])
    {
         audi c1=new audi();
         c1.color();
    }
}
interface car
{
   //int speed;
   void color();
}

class audi implements car
{
    public void color()
    {
        System.out.println("colorless");
    }
}
