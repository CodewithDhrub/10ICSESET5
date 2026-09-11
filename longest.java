import java.util.*;

class LongestWord
{
    String s;

    private void getData()
    {
        Scanner conin=new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        s=conin.nextLine();
    }

    public void display()
    {
        getData();

        String word="";
        String longest="";

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch!=' ')
            {
                word=word+ch;
            }
            else
            {
                if(word.length()>longest.length())
                    longest=word;

                word="";
            }
        }

        if(word.length()>longest.length())
            longest=word;

        System.out.println("Longest word = " + longest);
        System.out.println("Length = " + longest.length());
    }
}

class LongestWordDemo
{
    public static void main(String args[])
    {
        LongestWord ob=new LongestWord();
        ob.display();
    }
}