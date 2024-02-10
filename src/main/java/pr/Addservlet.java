package pr;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Обработка POST запроса
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // Проверка аутентификации и дальнейшие действия...
    }
}