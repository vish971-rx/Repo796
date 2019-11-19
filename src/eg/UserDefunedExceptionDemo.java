package eg;

class PasswordException extends Exception
{
	public PasswordException(String s)
	{
		super(s);
	}
}
public class UserDefunedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String userInput="abcde%";
try
{
	if(userInput.matches("[A-Za-z0-9]*"))  //'matches' check for regular expression
	{
		throw new PasswordException ("there should be atleast one special character");
	}
	
	if(userInput.length()<5)
	{
		throw new PasswordException ("Please enter atleast 5 length password");
	}
		
}
catch(Exception e)
{
	System.out.println(e);
	
}
	}

}
