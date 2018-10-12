import java.util.*;

 class occurence{

	 public static void main(String[] args){

	String str1,str2;

	int i,j;

	System.out.println("Enter 2 strings");

	Scanner s=new Scanner(System.in);

	str1= s.nextLine();

	str2=s.nextLine();

	if(str1.contains(str2)==true)

	{

		System.out.println("str1 conatains str2 ");

	}

	else

	{

		System.out.println("str1 do not conatains str2");

	}

	 }

}