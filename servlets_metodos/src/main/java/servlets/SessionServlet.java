package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        Cookie[] cookies = req.getCookies();
        boolean encontrouUsuario = false;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if ("usuario".equals(c.getName())) {
                    out.println("<h2>Bem-vindo de volta, " + c.getValue() + "</h2>");
                    encontrouUsuario = true;
                    break;
                }
            }
        }

        if (!encontrouUsuario) {
            Cookie userCookie = new Cookie("usuario", "usuarioX");
            userCookie.setMaxAge(60 * 60 * 24); // 1 dia
            resp.addCookie(userCookie);
            out.println("<h2>Cookie criado para o usuário 'usuarioX'</h2>");
        }
    }
}
