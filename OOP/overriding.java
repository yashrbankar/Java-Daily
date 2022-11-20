public class overriding
{
    public static  void main(String args[])
    {
         Me yash =new Me();
         yash.name="yash";
         yash.work();
    }
};

class Gparent
{
    int age;
    void work()
    {
        System.out.println("farmer");
    }
};

class Parent extends Gparent
{
    void work()
    {
       System.out.println("teacher");
    }
}

class Me extends Parent
{
    String name;
}
