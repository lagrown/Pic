package edu.acc.j2ee.Pic;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String destination = "login.jsp";
        HttpSession session = request.getSession();
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        UserBean bean = new UserBean(user, pass);
        ServletConfig sc = getServletConfig();

        if (request.getParameter("login") != null) {
            if (UserValidator.validate(bean)) {
                UserAuthenticator ua = new UserAuthenticator(sc);
                if (ua.authenticate(bean)) {
                    session.setAttribute("user", bean);
                    destination = "content.jsp";
                } else request.setAttribute("message", "Access Denied");
		}
		else request.setAttribute("message", "One or more fields are invalid");
		request.getRequestDispatcher(destination).forward(request, response);			
	}
}
        
    

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String destination = "login.jsp, content.jsp, uploader.jsp, result.jsp, about.jsp, view.jsp";

        HttpSession session = request.getSession();
        UserBean bean = (UserBean) session.getAttribute("user");
        if (bean == null) {
            destination = "login.jsp";
        } else if (request.getParameter("logout") != null) {
            session.removeAttribute("user");
            session.invalidate();
            destination = "login.jsp";
        } else if (request.getParameter("content") != null) {
            destination = "content.jsp";
        } else if (request.getParameter("uploader") != null) {
            destination = "uploader.jsp";
        } else if (request.getParameter("result") != null) {
            destination = "result.jsp";
        } else if (request.getParameter("about") != null) {
            destination = "about.jsp";
        } else if (request.getParameter("view") != null) {
            destination = "view.jsp";
        }

        request.getRequestDispatcher(destination).forward(request, response);
    }

}
