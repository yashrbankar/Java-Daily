class class_practice
{
    public static void main(String args[])
    {
        Student s=new Student(20,19,18);
        s.name="Yash";
        s.roll_num=1;
        System.out.println(s.averge());
    }
};


class Student 
{
   public int roll_num;
   public String name;
   public int m1,m2,m3;
   Student(int m1,int m2,int m3)
   {
       this.m1=m1;
       this.m2=m2;
       this.m3=m3;
   }
    int averge()
   {
      return (m1+m2+m3)/3;
   }
};
