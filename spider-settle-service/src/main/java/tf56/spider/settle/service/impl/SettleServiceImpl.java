package tf56.spider.settle.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import tf56.spider.settle.service.SettleService;

import java.util.Date;


/**
 * Created by dy on 16-4-18.
 */
//@org.springframework.stereotype.Service
@Service
public class SettleServiceImpl implements SettleService{
    private static final Logger logger = LoggerFactory.getLogger(SettleServiceImpl.class);
    @Transactional(rollbackFor = Exception.class)
    public String doSeckill(String name, Date time) throws Exception {
        logger.info("SettleService name："+name+", date："+ time);
        int i = 1/0;
        logger.info("================="+i);
        return "success by DY ,settleService 系统返回";
    }
}
