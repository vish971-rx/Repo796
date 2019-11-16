package eg;

public class Multiexception {
	public static void main(String[] args)
	{
		String a="100";
		String b="a";
		int res;
		try{
			
			int n1=Integer.parseInt(a);
			int n2=Integer.parseInt(b);
			res=divide(n1,n2);
			System.out.println("resultt is "+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide by zero");
			System.out.println(e.getMessage());
			
		}
		catch(NumberFormatException e1)
		{
			System.out.println("invalid");
			System.out.println(e1.getLocalizedMessage());

		}
		catch(Exception e2)
		{
			System.out.println(e2);
		}
		finally
		{
			System.out.println("jhkd");
		}
	}
		public static int divide(int a,int b)
		{
			return (a/b);
		}
	}


