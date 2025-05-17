package servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/request-body")
public class RequestBodyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");

        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String mensagem = req.getParameter("mensagem");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h2>Dados recebidos do formulário:</h2>");
        out.println("<p><strong>Nome:</strong> " + nome + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<p><strong>Mensagem:</strong> " + mensagem + "</p>");

        out.println("<hr><h3>Corpo da Requisição (raw):</h3><pre>");
        BufferedReader reader = req.getReader();
        String line;
        while ((line = reader.readLine()) != null) {
            out.println(line);
        }
        out.println("</pre>");
        out.println("</body></html>");
    }
}
