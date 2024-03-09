package tacos;

import lombok.Data;

/*
* Аннотация @Data относится к lombok.
* позволяет генерировать сеттеры, геттеры, конструктор и т.д.
* автоматически при помощи lombok
* */
@Data
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}
