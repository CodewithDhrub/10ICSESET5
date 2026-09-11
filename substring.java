import java.util.*;

class SubString
{
    String s;
    int start,end;

    private void getData()
    {
        Scanner conin=new Scanner(System.in);

        System.out.print("Enter a string: ");
        s=conin.nextLine();

        System.out.print("Enter starting index: ");
        start=conin.nextInt();

        System.out.print("Enter ending index: ");
        end=conin.nextInt();
    }

    public void display()
    {
        getData();

        System.out.println("Substring = " + s.substring(start,end));
    }
}

class SubStringDemo
{
    public static void main(String args[])
    {
        SubString ob=new SubString();
        ob.display();
    }
}