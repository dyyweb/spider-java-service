package tf56.spider.settle.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import tf56.spider.settle.service.SettleService;

import java.util.Date;


/**
 * Created by dy on 16-4-18.
 */
@org.springframework.stereotype.Service
@Service
public class SettleServiceImpl implements SettleService{

    public String doSeckill(String name, Date time){
        System.out.println("SettleService name："+name+", date："+ time);
        return "success by DY ,settleService 系统返回";
    }
}
