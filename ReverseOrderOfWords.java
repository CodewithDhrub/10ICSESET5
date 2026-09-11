import java.util.*;

class ReverseWordOrder
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

        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);

            if(ch!=' ')
            {
                word=ch+word;
            }
            else
            {
                result=result+word+" ";
                word="";
            }
        }

        result=result+word;

        System.out.println("Output = " + result);
    }
}

class ReverseWordOrderDemo
{
    public static void main(String args[])
    {
        ReverseWordOrder ob=new ReverseWordOrder();
        ob.display();
    }
}