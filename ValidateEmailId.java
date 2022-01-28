package assistedProjects;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailId 
{
	

	public static boolean valEmail(String email)
	{
		String regex="[\\w-] {1,20}@\\w{2,20}\\.\\w{2,3}$ ";
		Pattern pattern= Pattern.compile(regex);
		Matcher match=pattern.matcher(email);
		
		return Pattern.matches(regex, email);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the email id");
		String email=sc.nextLine();
		boolean valid=valEmail(email);
		if (valid)
			System.out.println(email + " is valid");
		else
			System.out.println(email +  " is not valid");
	}
}
