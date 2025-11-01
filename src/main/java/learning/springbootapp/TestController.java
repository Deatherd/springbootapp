package learning.springbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "✅ Spring Boot работает! Java 17! Время: " + java.time.LocalDateTime.now();
    }

    @GetMapping("/health")
    public String health() {
        return "{\"status\": \"UP\", \"message\": \"Кастомный health check\"}";
    }
}
