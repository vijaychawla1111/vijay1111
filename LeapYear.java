import java.util.Scanner;
	public class LeapYear
{
	public static void main(String args[])
{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the Year:");
	int year=obj.nextInt();
	if(year>=1583)
{
	if((year%4==0)&&(year%100!=0)||(year%400!=0))
{
	System.out.println("It is Leap Year");
}
}
	else
{
	System.out.println("It is not Leap Year");
}
}
}

