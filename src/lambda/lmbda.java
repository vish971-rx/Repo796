package lambda;
interface FunInterface
{
	void abstractFun(int x); //no implementation
}
	public class lmbda {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
FunInterface fob=(int x) -> System.out.println(2*x); 
fob.abstractFun(4);
	}

}
