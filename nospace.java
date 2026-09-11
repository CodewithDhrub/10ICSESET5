import java.util.*;

class RemoveSpaces
{
    String s;
    String result="";

    private void getData()
    {
        Scanner conin=new Scanner(System.in);

        System.out.print("Enter a string: ");
        s=conin.nextLine();
    }

    public void display()
    {
        getData();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
                result=result+s.charAt(i);
        }

        System.out.println("String without spaces = " + result);
    }
}

class RemoveSpacesDemo
{
    public static void main(String args[])
    {
        RemoveSpaces ob=new RemoveSpaces();
        ob.display();
    }
}