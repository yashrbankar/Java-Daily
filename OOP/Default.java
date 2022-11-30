interface Default
{
    public static void main(String arg[])
    {
         test2 obj=new test2();
         obj.var();
    }
};




interface Test 
{
    default void var()
   {
        System.out.println("sayali");
   }
}

class test2 implements Test
{

}

