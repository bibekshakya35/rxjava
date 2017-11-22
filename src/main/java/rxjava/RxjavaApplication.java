package rxjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RxjavaApplication {
    public static void main(String[] args) {
        SpringApplication.run(RxjavaApplication.class, args);
    }
}
