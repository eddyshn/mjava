package demo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/servlet")
public class ServletDemo implements Servlet {

    public ServletDemo() {
        System.out.println("*****************ServletDemo****************************");
    }

    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("*****************init****************************");
    }

    public ServletConfig getServletConfig() {
        System.out.println("*****************service****************************");
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("*****************service****************************");
    }

    public String getServletInfo() {

        System.out.println("*****************getServletInfo****************************");
        return null;
    }

    public void destroy() {
        System.out.println("*****************destroys****************************");
    }
}
