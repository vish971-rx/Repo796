
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@WebServlet(name = "UploadServlet", urlPatterns = { "/UploadServlet" })
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10, // 10mb
		maxFileSize = 1024 * 1024 * 1000, // 1 gb
		maxRequestSize = 1024 * 1024 * 1000) // 1 gb
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	PrintWriter out = null;
	Connection con = null;
	PreparedStatement ps = null;
	HttpSession session = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// doGet(request, response);

		response.setContentType("text/plain/charset=UTF-8");
		try {
			out = response.getWriter();

			session = request.getSession(false);
			String folderName = "resources";
			String uploadpath = request.getServletContext().getRealPath("") + folderName;
			File dir = new File(uploadpath);
			if (!dir.exists())
			{
				dir.mkdirs();
			}
			Part filepart = request.getPart("file");
			String firstname = request.getParameter("firstname");
			String lastname = request.getParameter("lastname");
			String filename = filepart.getSubmittedFileName();
			String path = folderName + File.separator + filename;
			Timestamp added_date = new Timestamp(System.currentTimeMillis());

			System.out.println("file name:" + filename);
			System.out.println("path:" + path);
			System.out.println("name:" + firstname);
			InputStream is = filepart.getInputStream();
			Files.copy(is, Paths.get(uploadpath + File.separator + filename), StandardCopyOption.REPLACE_EXISTING);
			System.out.println("connection establishing..");
			try {
				System.out.println("connection inside try catch..");
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
				System.out.println("connection established..");
				PreparedStatement ps = con.prepareStatement("insert into demo (firstname,lastname,filename,path,added_date) values(?,?,?,?,?)");

				ps.setString(1, firstname);
				ps.setString(2, lastname);
				ps.setString(3, filename);

				ps.setString(4, path);
				ps.setTimestamp(5, added_date);

				int i = ps.executeUpdate();
				if (i > 0) {
					session.setAttribute("filename", filename);
					Object msg = null;
					request.setAttribute("msg", msg);
					RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
					rd.forward(request, response);
					System.out.println("File uploaded succesfully");
				}
				// out.print("You have successfully registered...");

			} catch (Exception e2) {
				System.out.println(e2 );
			}
		} catch (Exception e2) {
			System.out.println(e2 );
		}

		out.close();

	}

}
