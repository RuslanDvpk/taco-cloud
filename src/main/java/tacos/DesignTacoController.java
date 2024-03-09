package tacos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import tacos.Ingredient;
import tacos.Ingredient.Type;

/*Аннотация @Slf4j из lombok для логирования
* */
@Slf4j
/*Аннотация @Controller для спринга, чтобы он добавил бин автоматически
* */
@Controller
/*Аннотация @RequestMapping Определяет тип запросов, которые отрабатывает этот контроллер
* В данном случае имеется ввиду, что этот контроллер обрабатывает запросы,
* пути которых начинаются с /design*/
@RequestMapping("/design")
/*Аннотация @SessionAttributes указывает, что объект TacoOrder должен
*поддерживаться на уровне сеанса. Важно поскольку создание тако это первый шаг формирования заказа
* И после нужно заказ сохранять для цепочки последующих запросов.
* */
@SessionAttributes("tacoOrder")
public class DesignTacoController {

    @ModelAttribute
    public void addIngredientsToModel(Model model){
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("FLTO","Flour Tortilla", Ingredient.Type.WRAP),
                new Ingredient("COTO","Corn Tortilla", Ingredient.Type.WRAP),
                new Ingredient("LVSH","Simple lavash", Ingredient.Type.WRAP),
                new Ingredient("GRBF","Ground Beef", Ingredient.Type.PROTEIN),
                new Ingredient("CARN","Carnitas", Ingredient.Type.PROTEIN),
                new Ingredient("TMTO","Diced Tomatoes", Ingredient.Type.VEGGIES),
                new Ingredient("LETC","Lettuce", Ingredient.Type.VEGGIES),
                new Ingredient("CHED","Cheddar", Ingredient.Type.CHEESE),
                new Ingredient("JACK","Monterrey Jack", Ingredient.Type.CHEESE),
                new Ingredient("SLSA","Salsa", Ingredient.Type.SAUCE),
                new Ingredient("SRCR","Sour Cream", Ingredient.Type.SAUCE)
        );

        Type[] types = Ingredient.Type.values();
        for (Type type:types){
            model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
        }
    }

    @ModelAttribute(name = "tacoOrder")
    public TacoOrder order(){
        return new TacoOrder();
    }

    @ModelAttribute(name = "taco")
    public Taco taco(){
        return new Taco();
    }

    @GetMapping
    public String showDesignForm(){
        return "design";
    }
    private Iterable<Ingredient> filterByType(List<Ingredient> ingredients, Type type){
        return ingredients
                .stream()
                .filter(x->x.getType().equals(type))
                .collect(Collectors.toList());
    }

}
