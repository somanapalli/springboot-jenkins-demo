import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MyController
{
    
    @GetMapping("/welcome")
    public String welcomeMessage()
    {
        return "Welcome to Spring Boot Application";
    }

}