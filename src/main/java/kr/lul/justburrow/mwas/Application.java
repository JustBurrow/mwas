package kr.lul.justburrow.mwas;

import kr.lul.justburrow.mwas.domain.entity.BootLogEntity;
import kr.lul.justburrow.mwas.domain.repository.BootLogRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
  /**
   * @author JB 2015/06/20
   */
  public static final String BASE_URI = "/mwas";

  public static void main(String[] args) throws Throwable {
    ApplicationContext context = SpringApplication.run(Application.class, args);

    // 서버 기동 로그 추가.
    BootLogRepository bootLogRepository = context.getBean(BootLogRepository.class);
    BootLogEntity log = bootLogRepository.save(new BootLogEntity());
    Logger logger = LoggerFactory.getLogger(BeanConstants.LOGGER);
    logger.info(log.toString());
  }
}
