import java.util.*;

class RemoveDuplicate
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
            char ch=s.charAt(i);

            if(result.indexOf(ch)==-1)
                result=result+ch;
        }

        System.out.println("String after removing duplicates = " + result);
    }
}

class RemoveDuplicateDemo
{
    public static void main(String args[])
    {
        RemoveDuplicate ob=new RemoveDuplicate();
        ob.display();
    }
}