package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/methods")
public class MethodsServlet extends HttpServlet {
    @Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setHeader("Allow", "GET, POST, PUT, DELETE, OPTIONS");
        resp.setContentType("text/plain");
        resp.getWriter().println("Métodos suportados: GET, POST, PUT, DELETE, OPTIONS");
    }
}
