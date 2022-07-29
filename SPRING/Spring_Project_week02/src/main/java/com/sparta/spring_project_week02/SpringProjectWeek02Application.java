package com.sparta.spring_project_week02;

import com.sparta.spring_project_week02.domain.Post;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaAuditing
@EnableScheduling
public class SpringProjectWeek02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectWeek02Application.class, args);

    }

}
