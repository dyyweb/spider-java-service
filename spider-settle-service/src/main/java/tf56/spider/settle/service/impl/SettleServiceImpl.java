package tf56.spider.settle.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tf56.spider.settle.service.SettleService;

import java.util.Date;


/**
 * Created by dy on 16-4-18.
 */
@org.springframework.stereotype.Service
@Service
public class SettleServiceImpl implements SettleService{
    private static final Logger logger = LoggerFactory.getLogger(SettleServiceImpl.class);
    public String doSeckill(String name, Date time){
        logger.info("SettleService name："+name+", date："+ time);
        return "success by DY ,settleService 系统返回";
    }
}
