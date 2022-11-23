public class Circle 
{
    private int r;
    Circle(int r)
    {
        this.r=r;
    }
    double area()
    {
        return 3.14*r*r;
    }
    public static void main(String args[])
    {
        Cylinder c=new Cylinder(5,10);
        System.out.println("volume: "+c.volume());
        System.out.println("Area : "+c.area());
    }
};

class Cylinder extends Circle
{
    private int h;
    Cylinder(int r , int h)
    {
        super(r);
        this.h=h;
    }
    double volume()
    {
        return area()*h;
    }
}

