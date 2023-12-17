package org.dv;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DvMain {

  public static ConfigurableApplicationContext run(final String[] args) {
    return SpringApplication.run(DvMain.class, args);
  }

  public static void main(final String[] args) {
    run(args);
  }
}