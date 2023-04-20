package restaurant.showcase.waiter;

import io.camunda.zeebe.spring.client.EnableZeebeClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableZeebeClient
public class WaiterMiranumApplication {
    public static void main(String[] args) {
        SpringApplication.run(WaiterMiranumApplication.class, args);
    }
}
