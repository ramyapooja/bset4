/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int c=0;
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(((s.charAt(i)>='0')&&(s.charAt(i)<='9'))||((s.charAt(i)>='a')&&(s.charAt(i)<='z')||(s.charAt(i)>='A')&&(s.charAt(i)<='Z'))||(s.charAt(i)==' '))
		            {
		            	continue;
			}
			else
			{
				c++;
			}
		}
		System.out.println(c);
	}
}
