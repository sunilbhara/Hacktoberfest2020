import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int no=sc.nextInt();
	int no1=no;
	int a=0;
	int s;
	while(no1>0)
	{
		
		s=no1%10;
		a=a*10+s;
		no1=no1/10;
	}

	if(a==no)
		System.out.println("palidrome");
	else
		System.out.println("not palindrome");

	}}