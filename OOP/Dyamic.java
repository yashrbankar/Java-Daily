
class Dynamic
{
    public static void main(String args[])
    {
        Super su= new Sub();
      // reference of super class and object of sub class 
        su.display();
        // method of object class is called not of reference class su
        //
    }
};

class Super
{
    void display()
    {
       System.out.print("Hello Super class ");
    }
};

class Sub extends Super
{
    void display()
    {
       //super.display(); its works
       System.out.print("Hello Sub class ");
    }
};

