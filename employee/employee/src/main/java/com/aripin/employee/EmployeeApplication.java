package com.aripin.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.aripin.employee.model.Employee;
import com.aripin.employee.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }

    @Bean
    CommandLineRunner init(EmployeeRepository repository) {
        return args -> {
            repository.save(new Employee("Aripin Sihabudin", "Engineering", "Software Engineer", 70000.0));
            repository.save(new Employee("Yani Kartika", "Marketing", "Marketing Manager", 80000.0));
        };
    }
}
