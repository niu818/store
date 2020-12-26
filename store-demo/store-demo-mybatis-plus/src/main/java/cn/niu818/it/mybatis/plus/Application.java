package cn.niu818.it.mybatis.plus;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot启动类
 *
 * @author niu
 * @date   2020-12-26
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        // 关闭Banner
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
