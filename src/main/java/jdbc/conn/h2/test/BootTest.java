package jdbc.conn.h2.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 嵌入到spring-boot中
 *
 * @author Carl Don
 * @Date 2023/4/2  13:57
 * @Version 1.0
 */
@SpringBootApplication
public class BootTest implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(BootTest.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    H2ConnTest1.main(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
