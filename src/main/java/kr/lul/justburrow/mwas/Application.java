package kr.lul.justburrow.mwas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
  /**
   * @author JB 2015/06/20
   */
  public static final String BASE_URI = "/mwas";

  public static void main(String[] args) throws Throwable {
    SpringApplication.run(Application.class, args);
  }
}
