package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* Аннотация @SpringBootApplication указывает на то, что это приложение Spring boot
* Это составная аннотация, объеденяющая три другие аннотации:
*   @SpringBootConfiguration - Определяет класс как класс конфигурации.
* Эта аннотация является специализированной формой аннотации @Configuration
*   @EnableAutoConfiguration - включает автоконфигурацию SpringBoot.
* Она сообщает Spring Boot о необходимости автоматически настраивать любые компоненты,
* которые могут понадобиться
*   @ComponentScan - включает сканирование компонентов.
* Механизм сканирования позволяет объявлять другие классы с аннотациями, такими как
* @Component, @Controller, @Service, Чтобы фреймворк Spring автоматически обнаруживал и
* регистрировал их как компоненты в контексте приложения Spring
* */
@SpringBootApplication
public class TacoCloudApplication {

    /**
     * Код данного метода шаблонный.
     * Вызывается метод run() Класса SpringApplication который выполняет фактическую загрузку
     * метод run() принимает два параметра: класс конфигурации и аргументы коммандной строки
     * В общем случае необязательно, чтобы это был тот же класс, в котором происходит запуск,
     * но это самый удобный и распространенный выбор.
     */
    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
    }

}
