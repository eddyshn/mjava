package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cow")
public class Servlet4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
        System.out.println("我是母牛");
        String love = (String) this.getServletContext().getAttribute("love");
        System.out.println(love);
        resp.setContentType("text/html;charset=utf-8");
        //向页面输出内容
        PrintWriter out = resp.getWriter();
        out.println("收到的表白："+love);
        System.out.println("母牛收到");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
    }
}
