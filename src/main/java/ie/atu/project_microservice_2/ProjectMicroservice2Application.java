package ie.atu.project_microservice_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjectMicroservice2Application {

    public static void main(String[] args) {
        SpringApplication.run(ProjectMicroservice2Application.class, args);
    }

}
