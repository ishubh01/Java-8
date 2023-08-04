package CodePractise;

import java.util.Scanner;

public class CheckPalindrome {


	public static void main(String[] args)
	
    {
		
		int input= 121;

        String str_input1 = String.valueOf(input); 
        
        String str = new StringBuilder(str_input1).reverse().toString(); // reversing the input string
 
        if (str.equals(str_input1)) 
        {
            System.out.println(input + " is Palindrome");
        }
        else
        {
            System.out.println(input+ " is not Palindrome");
        }
    }
	}

