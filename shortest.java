import java.util.*;

class ShortestWord
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
        String shortest="";

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch!=' ')
            {
                word=word+ch;
            }
            else
            {
                if(shortest.equals("") || word.length()<shortest.length())
                    shortest=word;

                word="";
            }
        }

        if(shortest.equals("") || word.length()<shortest.length())
            shortest=word;

        System.out.println("Shortest word = " + shortest);
        System.out.println("Length = " + shortest.length());
    }
}

class ShortestWordDemo
{
    public static void main(String args[])
    {
        ShortestWord ob=new ShortestWord();
        ob.display();
    }
}