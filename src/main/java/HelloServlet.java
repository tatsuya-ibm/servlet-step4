import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;

//import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        LocalTime lt = LocalDateTime.now().toLocalTime();

        request.setAttribute("ltstr", lt.toString());

        // response.setContentType("text/html; charset=UTF-8");
        request.getRequestDispatcher("/HelloPage.jsp").forward(request, response);
    }
}
