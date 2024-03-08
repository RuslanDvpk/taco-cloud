package tacos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/*
* @WebMvcTest специальная тестовая аннотация из Spring Boot
* которая организует запуск теста в контексте приложения Spring MVC
* В данном случае она обеспечивает регистрацию класса HomeControler
* в Spring MVC, чтобы дать возможность отправлять ему запросы.
*
* @WebMvcTest также настраивает поддержку тестирования Spring MVC в Spring
* */
@WebMvcTest
public class HomeControllerTest {

    /*
    * to do: Описать аннотацию @Autowired
    * */
    @Autowired
    private MockMvc mockMvc;

    /*
     * to do: Описать аннотацию @Autowired
     * */
    @Test
    public void testHomePage() throws Exception{
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"))
                .andExpect(content().string(
                        containsString("Welcome")));
    }

}
