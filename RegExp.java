package assistedProjects;

import java.util.regex.Pattern;

public class RegExp 
{
	public static void main(String args[]){  
		System.out.println("by character classes and quantifiers ...");  
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9848665468"));  
		System.out.println(Pattern.matches("[789][0-9]{9}", "9553809233"));  
		 
		System.out.println(Pattern.matches("[789][0-9]{9}", "1234567891"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "4455667747"));  
		System.out.println(Pattern.matches("[789][0-9]{9}", "8937383932"));
}
}
