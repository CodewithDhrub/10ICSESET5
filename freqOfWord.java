import java.util.*;

class WordFrequency
{
    String s;
    String search;
    int count=0;

    private void getData()
    {
        Scanner conin=new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        s=conin.nextLine();

        System.out.print("Enter word to search: ");
        search=conin.nextLine();
    }

    public void display()
    {
        getData();

        String word="";

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch!=' ')
            {
                word=word+ch;
            }
            else
            {
                if(word.equals(search))
                    count++;

                word="";
            }
        }

        if(word.equals(search))
            count++;

        System.out.println(search + " occurs " + count + " times");
    }
}

class WordFrequencyDemo
{
    public static void main(String args[])
    {
        WordFrequency ob=new WordFrequency();
        ob.display();
    }
}