import java.util.*;

class vowels

{

   public static void main(String args[])

   {

       String current,remove;

       Scanner scan=new Scanner(System.in);

       System.out.print("Enter a String ");

       current = scan.nextLine();

       remove=current.replaceAll("[aeiouAEIOU]", "");

       System.out.print(remove);

   }

}