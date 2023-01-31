package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Gym;

/**
 * Servlet implementation class GymServlet
 */
@WebServlet("/GymServlet")
public class GymServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/gymRequest.jsp");
		d.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// リクエストパラメータを取得
		String name = request.getParameter("name");
		String area = request.getParameter("area");
		String[] option = request.getParameterValues("option");

		// 入力値をプロパティーに設定
		Gym g = new Gym();
		g.setName(name);
		g.setArea(area);

		int total = 2000;
		if(option != null) {
			for(int i = 0; i < option.length; i++) {
				total += Integer.parseInt(option[i]);
			}
		}
		g.setTotal(total);


		// リクエストスコープに保存
		request.setAttribute("gym", g);

		// フォワード
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/gymResult.jsp");
		d.forward(request, response);
	}

}
