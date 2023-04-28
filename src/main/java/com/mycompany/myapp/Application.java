import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class Application {

    public static void main(String[] args) {
        System.setProperty("server.port", "8081");
        SpringApplication.run(Application.class, args);
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Validate the user's credentials and redirect to a success page
        if (username.equals("admin") && password.equals("password")) {
            return "success";
        } else {
            return "error";
        }
    }
}
