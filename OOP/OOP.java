
public class OOP
{
   public static void main(String args[])
   {
       Pen p1=new Pen();
       p1.setColor("yash");
       System.out.println(p1.color);
   }
};

class Pen
{
    int size;
    String color;
    void setColor(String newColor)
    {
       color=newColor;
    }
    void setSize(int newSize)
    {
         size=newSize;
    }
}


