import java.util.*;

class CharacterCount
{
    String s;
    int letters=0;
    int digits=0;
    int spaces=0;
    int special=0;

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

            if((ch>='A' && ch<='Z') ||
               (ch>='a' && ch<='z'))
                letters++;
            else if(ch>='0' && ch<='9')
                digits++;
            else if(ch==' ')
                spaces++;
            else
                special++;
        }

        System.out.println("Letters = " + letters);
        System.out.println("Digits = " + digits);
        System.out.println("Spaces = " + spaces);
        System.out.println("Special Characters = " + special);
    }
}

class CharacterCountDemo
{
    public static void main(String args[])
    {
        CharacterCount ob=new CharacterCount();
        ob.display();
    }
}