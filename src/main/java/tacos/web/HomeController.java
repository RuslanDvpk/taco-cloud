package tacos.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.SecureRandom;

/*
* Аннотация @Controller используется для определения классов в качестве контроллеров в Spring MVC.
* Это помогает Spring определить компоненты, которые будут обрабатывать входящие запросы.
* Её основная цель идентифицировать класс как компонент, доступный механизму сканирования компонентов.
* В данном случае механизм сканирования автоматически обнаружит его и создаст экземпляр
* HomeController Как bean-компонент в контесте приложения Spring
* */
@Controller
public class HomeController {

    /*
    * @GetMapping — Обрабатывает get-запросы
    *
    * Аннотация @GetMapping — это просто аннотация которая содержит @RequestMapping(method = RequestMethod.GET).
    * Она также позволяет более глубоко настроить метод-обработчик.
    * Ее параметры(они конвертируются в аналогичные параметры @RequestMapping):
    *
    * https://habr.com/ru/articles/471140/
    *
    * */
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
