package cass.jwt_mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JwtMailApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtMailApplication.class, args);
    }

}
