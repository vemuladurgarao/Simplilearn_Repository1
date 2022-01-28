package assistedProjects;

import java.util.Scanner;

public class ArithematicCalculator
{
 public static void main(String[] args) {
	
	 
	 char operator;
	 int num1;
	 int num2;
	 int result;
	 
	 Scanner scan=new Scanner(System.in);
	 
	 System.out.println("choose an operator : +,-,*,/,%");
	 operator=scan.next().charAt(0);
	 
	 System.out.println("enter the first number");
	 num1=scan.nextInt();
	 
	 System.out.println("enter the second number");
	 num2=scan. nextInt();
	 
	 switch(operator)
	 {
	 case '+':
		 result=num1+num2;
		 System.out.println(result);
		 break;
		 
	 case '-':
		 result=num1-num2;
		 System.out.println(result);
		 break;
		 
	 case '*':
	      result=num1*num2;
	 System.out.println(result);
	 break;
	 
	 case '/':
		 result=num1/num2;
		 System.out.println(result);
		 break;
		 
	 case '%':
		 result=num1%num2;
		 System.out.println(result);
		 break;
		 
		 default :
			 System.out.println("invalid operatot");
	 }
	 
}
}
