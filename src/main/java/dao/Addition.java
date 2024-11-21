package dao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdbc.Insert;

import java.io.IOException;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Addition")
public class Addition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addition() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String account = request.getParameter("account");
		String pwd = request.getParameter("pwd");
		String mail = request.getParameter("mail");
		
		if (account.equals("")||pwd.equals("")||mail.equals("")) {
			request.setAttribute("addError", "请输入完整");
		} else {
			int result = new Insert().insert(account, pwd, mail);
			if (result == 1) {
				request.setAttribute("addSuccess", "注册成功");
			}else {
				request.setAttribute("addSuccess", "注册失败");
			}
			
		}
		
		request.getRequestDispatcher("register.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
