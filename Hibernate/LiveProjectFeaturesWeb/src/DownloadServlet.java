

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadServlet
 */
@WebServlet(name="DownloadServlet",urlPatterns={"/DownloadServlet"})
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public static int Buffer_Size=1024*100;
	public static final String UPLOAD_DIR="resources";
	public static String filename=null;
    public DownloadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	filename=request.getParameter("filename");
	if(filename==null || filename.equals(""))
	{
		response.setContentType("text/html");
	response.getWriter().println("<h3>File"+filename+"is not present..!</h3>");
	}
	else
	{
		String applicationpath=getServletContext().getRealPath("");
		String downloadpath=applicationpath+File.separator+UPLOAD_DIR;
		String filepath=downloadpath+File.separator+filename;
		System.out.println(filename);
		System.out.println(filepath);
		System.out.println("filename:"+filename);
		System.out.println("filepath:"+filepath);
		File file=new File(filepath);
		OutputStream outstream=null;
		FileInputStream inputstream=null;
		if(file.exists())
		{
			String mimetype="application/octet-stream";
			response.setContentType(mimetype);
			String headerkey="Content-Disposition";
			String headervalue=String.format("attachment;filename=\"%s\"", file.getName());
			response.setHeader(headerkey, headervalue);
			try
			{
				outstream=response.getOutputStream();
				inputstream=new FileInputStream(file);
				byte[] buffer=new byte[Buffer_Size];
				int byteread=-1;
				while((byteread=inputstream.read(buffer))!=-1)
				{
					OutputStream outputstream = null;
					outputstream.write(buffer,0,byteread);
				}
			}catch(Exception e)
			{
				System.out.println("Exception while performing I/O operation"+e.getMessage());
			}
			finally
			{
				if(inputstream!=null)
				{
					inputstream.close();
				}
				outstream.flush();
				if(outstream!=null)
				{
					outstream.close();
				}
			}
		}else 
		{
			response.setContentType("text/html");
			response.getWriter().println("<h3>File"+filename+"is not present..!<h3>");
			
		}
		
	}
	
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
