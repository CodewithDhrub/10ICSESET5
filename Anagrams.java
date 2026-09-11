import java.util.*;

class Anagram
{
    String s1,s2;

    private void getData()
    {
        Scanner conin=new Scanner(System.in);

        System.out.print("Enter first string: ");
        s1=conin.nextLine().toUpperCase();

        System.out.print("Enter second string: ");
        s2=conin.nextLine().toUpperCase();
    }

    public void display()
    {
        getData();

        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        String x=new String(a);
        String y=new String(b);

        if(x.equals(y))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}

class AnagramDemo
{
    public static void main(String args[])
    {
        Anagram ob=new Anagram();
        ob.display();
    }
}