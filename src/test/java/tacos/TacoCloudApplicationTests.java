package tacos;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/*
* Аннотация @SpringBootTest настраивает JUnit на запуск теста с поддержкой возможностей SpringBoot
* Это составная аннотация, которая сама снабжена аннотацией @ExtendWith(SpringExtension.class),
* добавляющей поддержку тестирования Spring в JUnit 5
* */
@SpringBootTest
class TacoCloudApplicationTests {

    @Test
    void contextLoads() {
    }

}
