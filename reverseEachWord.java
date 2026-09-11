import java.util.*;

class ReverseWords
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
        String result="";

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch!=' ')
            {
                word=word+ch;
            }
            else
            {
                for(int j=word.length()-1;j>=0;j--)
                    result=result+word.charAt(j);

                result=result+" ";
                word="";
            }
        }

        for(int j=word.length()-1;j>=0;j--)
            result=result+word.charAt(j);

        System.out.println("Output = " + result);
    }
}

class ReverseWordsDemo
{
    public static void main(String args[])
    {
        ReverseWords ob=new ReverseWords();
        ob.display();
    }
}