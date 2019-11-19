 package multithreading;

 class MultiEvenOdd implements Runnable
 {
	 private static boolean flag=true;
	 public synchronized void run()
	 {
		 if(flag==true)
		 {
			 flag=false;
			 printEven();
		 }
		 else
			 printOdd();
	 }
	 public void printEven()
	 {
		 long thid=Thread.currentThread().getId();

		 for(int i=0;i<=10;i+=2)
{System.out.println("even="+i+" id is:"+ thid);
	
} flag=false;
}
	 public void printOdd()
	 {
		 long thid=Thread.currentThread().getId();

		 for(int i=1;i<=10;i+=2)
System.out.println("odd="+i+"thread id is:"+ thid);
	flag=true; 
	}
 }
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultiEvenOdd ob=new MultiEvenOdd();
Thread even=new Thread(ob);
Thread odd=new Thread(ob);
//ob.printEven();
//sob.printOdd();
odd.start();
even.start();


	}

}
 
