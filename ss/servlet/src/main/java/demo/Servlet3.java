package demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calf")
public class Servlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
        System.out.println("我是小牛");
        //设置输出格式和字符编码
        resp.setContentType("text/html;charset=utf-8");
        //向页面输出内容
        PrintWriter out = resp.getWriter();
        out.println("<h1>我是小牛</h1>");
        ServletContext application = this.getServletContext();
        String name = (String) application.getAttribute("name");
        System.out.println("收到的名字："+name);
        out.println("收到的名字："+name);
        System.out.println("小牛收到");
        application.setAttribute("love","公牛说他爱你");
        application.getRequestDispatcher("/cow").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("我是dopost");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>我是servlet doPost 33</h1>");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("我是service333");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>我是servlet service333</h1>");
    }
}
