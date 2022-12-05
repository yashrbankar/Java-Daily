class keywords
{
    public static void main(String args[])
    {
        child c=new child(1,2,3);
        c.display();
        c.Superdisplay();
    }
};

class Parent
{
    int a;
    int b;
    Parent(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void display()
    {
        System.out.println("parent");
    }
};

class child extends Parent
{
   int c;
   int b;
    child(int a,int b,int c)
    {
        super(a,b);
        this.c=c;
        this.b=100;
    }
    public void display()
    {
        System.out.println("child");
        System.out.println(b);
    }
    
    public void Superdisplay()
    {
        super.display();
        System.out.println(super.a);
        System.out.println(super.b);
    }
    
   
};






