package tf56.spider.settle;

import ch.qos.logback.ext.spring.LogbackConfigurer;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpiderSettleService {
    public static void main(String[] args) {
        try {
            LogbackConfigurer.initLogging("classpath:config/logback.xml");
            new ClassPathXmlApplicationContext("classpath:config/dubbo-settle-service.xml");
            System.out.println("***********服务启动成功***********");
            while (true) {
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("xxxxxxxxxxxx服务启动失败xxxxxxxxxxxx");
            e.printStackTrace();
        }
    }
}
