import java.util.*;

class EqualsString
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

        if(s1.equals(s2))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
    }
}

class EqualsStringDemo
{
    public static void main(String args[])
    {
        EqualsString ob=new EqualsString();
        ob.display();
    }
}