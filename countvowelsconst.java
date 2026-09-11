import java.util.*;

class VowelConsonant
{
    String s;
    int vowel=0;
    int consonant=0;

    private void getData()
    {
        Scanner conin=new Scanner(System.in);

        System.out.print("Enter a string: ");
        s=conin.nextLine().toLowerCase();
    }

    public void display()
    {
        getData();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch>='a' && ch<='z')
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    vowel++;
                else
                    consonant++;
            }
        }

        System.out.println("Vowels = " + vowel);
        System.out.println("Consonants = " + consonant);
    }
}

class VowelConsonantDemo
{
    public static void main(String args[])
    {
        VowelConsonant ob=new VowelConsonant();
        ob.display();
    }
}