package demo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/servlet")
public class ServletDemo implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("*****************init****************************");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
