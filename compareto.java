import java.util.*;

class CompareString
{
    String s1,s2;

    private void getData()
    {
        Scanner conin=new Scanner(System.in);

        System.out.print("Enter first string: ");
        s1=conin.nextLine();

        System.out.print("Enter second string: ");
        s2=conin.nextLine();
    }

    public void display()
    {
        getData();

        int result=s1.compareTo(s2);

        if(result==0)
            System.out.println("Both strings are equal");
        else if(result<0)
            System.out.println("First string comes before second string");
        else
            System.out.println("First string comes after second string");
    }
}

class CompareStringDemo
{
    public static void main(String args[])
    {
        CompareString ob=new CompareString();
        ob.display();
    }
}