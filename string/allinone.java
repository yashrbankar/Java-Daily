import java.util.*;

public class allinone
{
    
    public static void main(String args[])
    {
        String str;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string ::  ");
        str=sc.next();
        System.out.println("string : "+str);
        String s1=new String("yash");// inside the heap memory
        if(s1!=str)
        {
            System.out.println("equal string in heap");
        }
        System.out.println(str.substring(0,3));
    }
}

