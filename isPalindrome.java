import java.util.*;

class StringPalindrome
{
    String s;
    String rev="";

    private void getData()
    {
        Scanner conin=new Scanner(System.in);

        System.out.print("Enter a string: ");
        s=conin.nextLine();
    }

    public void display()
    {
        getData();

        for(int i=s.length()-1;i>=0;i--)
            rev=rev+s.charAt(i);

        if(s.equals(rev))
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");
    }
}

class StringPalindromeDemo
{
    public static void main(String args[])
    {
        StringPalindrome ob=new StringPalindrome();
        ob.display();
    }
}