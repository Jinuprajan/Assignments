package javaassignment.java.in;
import java.util.Scanner;

public class Assignment_C_PangramChecker {
	    public static void pangramSentence(String sentence)
		{
			String check=sentence.toLowerCase();
			int count=0;
			String compare="abcdefghijklmnopqrstuvwxyz";
			for(int i=0;i<compare.length();i++)
			{
				for(int j=0;j<check.length();j++)
				{
					if(compare.charAt(i)==check.charAt(j))
					{
						count++;
						break;
					}
				}
			}
			if(count==26)
			{
				System.out.println("pangram");
			}
			else
			{
				System.out.println("not pangram");
			}
		}
		public static void  main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a word");
			String sentence=sc.nextLine();
			pangramSentence(sentence);
			
		}

	}

