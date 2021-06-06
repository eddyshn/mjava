package demo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bull")
public class Servlet2 extends GenericServlet {


    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("我是草原上的公牛");
        System.out.println("我让小牛把我对母牛的爱传给她");
        System.out.println("该说的话我给小牛说了，小牛听到了给我回复收到，并把我说的话传给母牛");
        ServletContext application = this.getServletContext();
        application.setAttribute("name","母牛");
        application.getRequestDispatcher("/calf").forward(servletRequest,servletResponse);
    }
}
