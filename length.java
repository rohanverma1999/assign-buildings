import java.util.*;

class length

{

   public static int countWords(String str)

    {

        String sentence;

        Scanner s=new Scanner(System.in);

        System.out.print("Enter a Sentence : ");

        sentence=s.nextLine();		

        System.out.print("Total Number of Words in Entered Sentence is ");

        int count = 1;

        for(int i=0; i<=str.length()-1; i++)

        {

            if(str.charAt(i) == ' ' && str.charAt(i+1)!=' ')

            {

                count++;

            }

        }

      System.out.print(count);

   }

}