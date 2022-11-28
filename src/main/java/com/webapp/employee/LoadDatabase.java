package com.webapp.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Employee("pavan", "software engineer")));
      log.info("Preloading " + repository.save(new Employee("akshay", "software engineer")));
      log.info("Preloading " + repository.save(new Employee("onkar", "software engineer")));
      log.info("Preloading " + repository.save(new Employee("kuldeep", "software engineer")));
    };
  };
};
