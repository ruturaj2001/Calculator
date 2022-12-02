public class Calculator{
	private int num1;
	private int num2;
    Calculator(int i,int j)
	{
		num1=i;
		num2=j;
	}
	public  void printAdd()
	{
        System.out.println(num1+num2);
	}
	public void printSub()
	{
		System.out.println(num1-num2);
	}
	public  void printProduct()
	{
        System.out.println(num1+num2);
	}
	try{
		public void printQuotient()
	{
		System.out.println(num1/num2);
	}
	}
	catch(Exception ex)
	{
	System.out.println(ex);
	}
	
	
     
}
