import java.util.*;
class try1
{
    public static void main(String ar[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the size");
         int n=sc.nextInt();
         int arr[]=new int[n];
         System.out.println("enter the values ");
         for(int i=0;i<n;i++)
         {
             int val=sc.nextInt();
             arr[i]=val;
         }
    }
};
