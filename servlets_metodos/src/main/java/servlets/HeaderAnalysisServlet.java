package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/headers")
public class HeaderAnalysisServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        out.println("<html><body><h2>Cabeçalhos da Requisição</h2>");
        Enumeration<String> headerNames = req.getHeaderNames();

        while (headerNames.hasMoreElements()) {
            String header = headerNames.nextElement();
            out.println("<b>" + header + ":</b> " + req.getHeader(header) + "<br>");
        }

        out.println("<hr><b>IP do usuário:</b> " + req.getRemoteAddr());
        out.println("<br><b>Versão HTTP:</b> " + req.getProtocol());
        out.println("</body></html>");
    }
}
