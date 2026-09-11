import java.util.*;

class ReverseString
{
    String s;
    String rev="";

    private void getData()
    {
        Scanner conin=new Scanner(System.in);

        System.out.print("Enter a string: ");
        s=conin.nextLine();
    }

    public void display()
    {
        getData();

        for(int i=s.length()-1;i>=0;i--)
            rev=rev+s.charAt(i);

        System.out.println("Reverse = " + rev);
    }
}

class ReverseStringDemo
{
    public static void main(String args[])
    {
        ReverseString ob=new ReverseString();
        ob.display();
    }
}