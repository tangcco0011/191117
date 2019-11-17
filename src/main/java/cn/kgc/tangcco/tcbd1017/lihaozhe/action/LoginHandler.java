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
 * Servlet implementation class LoginHandler
 */
@WebServlet("/login.action")
public class LoginHandler extends HttpServlet {
       
	private static final long serialVersionUID = -7745510595361767547L;
	private UserService userService = new UserServiceImpl();

	/**
     * @see HttpServlet#HttpServlet()
     */
    public LoginHandler() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		userService.saveUser();
	}

}
