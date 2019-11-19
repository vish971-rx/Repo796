
package eg;
import java.io.*;
public class FileExp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis=null;
fis=new FileInputStream("D:\\file1.txt");
int k; //k act as a position pointer
while((k=fis.read())!=-1)
{
	System.out.print((char)k);
}
	fis.close();

}

	
}
