import java.util.*;

class reverse

{

   public static void main(String args[])

   {

      String current,reverse="";

      Scanner s = new Scanner(System.in);

      System.out.println("Enter a string");

      current=s.nextLine();

      int length=current.length();

      for(int i=length-1;i>=0;i--)

        reverse=reverse+current.charAt(i);

      System.out.println("Reverse of string is "+reverse);

   }

}