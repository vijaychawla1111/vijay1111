class RepeatedNo
{
	public static void main(String []arg)
	{
	int i,j;
	int a[]=new int[100];
	
        a[99]=49;
	
	for(i=0;i<99;i++)
	{
		a[i]=i;
	}	
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{

		if(a[i]==a[j])
		{
			System.out.println("Repeated no is"+a[j]);
		}
		

		}
	}
	
	}
}
