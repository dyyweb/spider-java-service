package tf56.spider.settle;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpiderSettleService {
    public static void main(String[] args) {
        try {
            new ClassPathXmlApplicationContext("classpath:conf/dubbo-settle-service.xml");
            System.out.println("***********服务启动成功***********");
            while (true) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("xxxxxxxxxxxx服务启动失败xxxxxxxxxxxx");
            e.printStackTrace();
        }
    }
}
