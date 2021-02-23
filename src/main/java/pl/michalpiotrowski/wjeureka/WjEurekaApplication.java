package pl.michalpiotrowski.wjeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WjEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WjEurekaApplication.class, args);
    }

}
