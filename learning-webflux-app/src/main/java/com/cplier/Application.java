package com.cplier;

import com.cplier.config.DatasourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.reactive.config.EnableWebFlux;

@Configuration
@EnableTransactionManagement
@EnableWebFlux
@SpringBootApplication
@Import(DatasourceConfig.class)
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
