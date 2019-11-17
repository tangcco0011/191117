package cn.kgc.tangcco.tcbd1017.lihaozhe.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.kgc.tangcco.tcbd1017.lihaozhe.service.UserService;
import cn.kgc.tangcco.tcbd1017.lihaozhe.service.impl.UserServiceImpl;

/**
 * Servlet implementation class Update
 */
@WebServlet("/update.action")
public class Update extends HttpServlet {
	private static final long serialVersionUID = -1312579409645536276L;
	private static UserService userService = new UserServiceImpl();

	/**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		userService.updateUser();
	}

}
