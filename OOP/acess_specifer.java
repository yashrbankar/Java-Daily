
public class acess_specifer
{
    public static void main(String args[])
    {
        Banking obj=new Banking();
        obj.username="yashrbankar";
        //obj.password=1212;
        // password is declared private 
        obj.set(1212);
        System.out.println(obj.username);
    }
};


class Banking
{
    public String username;
    private int password;
    public void set(int pass)
    {
        password=pass;
    }
};



