import java.util.Scanner;
    class Precedencee
{
	public static void main(String[] args)
{
	Scanner obj=new Scanner(System.in);
	double a,b,c,result1,result2,result3,result4;
	System.out.println("Enter the value of a:"); 
	a=obj.nextDouble();
	System.out.println("Enter the value of b:"); 
	b=obj.nextDouble();
	System.out.println("Enter the value of c:"); 
	c=obj.nextDouble();
	result1=a+b*c;
	System.out.println("a+b*c="+result1);
	result2=a*b+c;
	System.out.println("a*b+c="+result2);
	result3=c+a/b;
	System.out.println("c+a/b="+result3);
	result4=a%b+c;
	System.out.println("a%b+c="+result4);
}
}
