import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int spaceCount = 0;
                        for (char c : str.toCharArray()) 
                        {
                           if (c == ' ')
                           {
                                spaceCount++;
                           }
                        }
                        System.out.println(spaceCount);
	}
}
