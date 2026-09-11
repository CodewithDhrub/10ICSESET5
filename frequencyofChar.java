import java.util.*;

class CharacterFrequency
{
    String s;
    char ch;
    int count=0;

    private void getData()
    {
        Scanner conin=new Scanner(System.in);

        System.out.print("Enter a string: ");
        s=conin.nextLine();

        System.out.print("Enter character to search: ");
        ch=conin.next().charAt(0);
    }

    public void display()
    {
        getData();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
                count++;
        }

        System.out.println("Frequency = " + count);
    }
}

class CharacterFrequencyDemo
{
    public static void main(String args[])
    {
        CharacterFrequency ob=new CharacterFrequency();
        ob.display();
    }
}