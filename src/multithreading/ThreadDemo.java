package multithreading;

class MultiThreading extends Thread  //asynchronous
{
	public void run()
	{
		try
		{
			long thid=Thread.currentThread().getId();
			String s=Thread.currentThread().getName();
			System.out.println("Thread is running"+ thid);
			System.out.println("thread name="+s);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

for(int i=0;i<5;i++)
{
	MultiThreading ob=new MultiThreading();
	ob.start();
}
	}

}
