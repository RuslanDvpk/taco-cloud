package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.SecureRandom;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
