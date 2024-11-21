package dao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jdbc.Selectuser;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class Logincheck
 */
@WebServlet("/Logincheck")
public class Logincheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> list = new Selectuser().select();
		String account = request.getParameter("account");
		String pwd = request.getParameter("pwd");
		HttpSession session = request.getSession();
		for (User user : list) {
			if (account == null || pwd == null || account.equals("") || pwd.equals("")) {
				request.setAttribute("loginError", "账号或密码不能为空");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			} else {
				if (account.equals(user.getAccoount())&&pwd.equals(user.getPwd())) {
					session.setAttribute("loginSuccess", user.getAccoount());
					request.getRequestDispatcher("front.jsp").forward(request, response);
				}
			}
		}
		request.setAttribute("loginError2", "账号或密码错误");
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
