import java.util.*;

class WordCount
{
    String s;
    int count=1;

    private void getData()
    {
        Scanner conin=new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        s=conin.nextLine().trim();
    }

    public void display()
    {
        getData();

        if(s.length()==0)
        {
            System.out.println("Number of words = 0");
            return;
        }

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
                count++;
        }

        System.out.println("Number of words = " + count);
    }
}

class WordCountDemo
{
    public static void main(String args[])
    {
        WordCount ob=new WordCount();
        ob.display();
    }
}