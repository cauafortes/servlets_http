package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/status")
public class StatusServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String codeParam = req.getParameter("code");
        int code;

        try {
            code = Integer.parseInt(codeParam);
        } catch (NumberFormatException e) {
            code = 400;
        }

        resp.setStatus(code);
        resp.setContentType("text/plain");
        resp.getWriter().println("Código de status enviado: " + code);
    }
}
