package com.zhixin.rd.rkjc.web.common;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.zhixin.rd.rkjc.web.dao.read.rkjcxxSearch.IRkjcxxMapper;
import com.zhixin.rd.rkjc.web.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;


public class PowerCacheUtil implements InitializingBean, Runnable {

    private static final Logger logger = LoggerFactory.getLogger(PowerCacheUtil.class);


    @Autowired
    private IRkjcxxMapper rkjcxxMapper;



    private final static ReadWriteLock rwl = new ReentrantReadWriteLock();
    private final static Lock readLock = rwl.readLock();
    private final static Lock writeLock = rwl.writeLock();


    private static Map<String, Long> rkjcxxCountMap = new HashMap<>();


    /**
     * 统计人口
     * 总数,本省，外省，昨日更新
     */
    public void loadRKjcxxCountMap() {
        long statTime = System.currentTimeMillis();
        logger.info("--------------加载统计人口数据缓存 start(" + statTime + ")------------------------");
        writeLock.lock();
        synchronized (rkjcxxCountMap) {
            try {
                rkjcxxCountMap.clear();

//                List<CodeEntity> resultList = rkjcxxMapper.rkJcxxStatistics();
//                for (CodeEntity codeEntity : resultList) {
//                    rkjcxxCountMap.put(codeEntity.getCodeKey(), codeEntity.getCodeValue());
//                }
                rkjcxxCountMap.put("zs", rkjcxxMapper.rkJcxxStatisticsByZs());
                rkjcxxCountMap.put("fhn",rkjcxxMapper.rkJcxxStatisticsByFhn());
                rkjcxxCountMap.put("zrxz",rkjcxxMapper.rkJcxxStatisticsByZrxz());
                //河南人
                Long hn = 0L;
                if (rkjcxxCountMap.get("zs") != null && rkjcxxCountMap.get("fhn") != null) {
                    hn = rkjcxxCountMap.get("zs") - rkjcxxCountMap.get("fhn");
                }
                rkjcxxCountMap.put("hn", hn);


            } catch (Exception e) {
                logger.info("loadRKjcxxCountMap===" + e.toString());
            } finally {
                writeLock.unlock();
            }
        }
        logger.info("--------------加载统计人口限数据缓存 end cost" + (System.currentTimeMillis() - statTime) + " ms------------------------");
        logger.info("统计人口====" + rkjcxxCountMap.toString());

    }

    public Map<String, Long>  getLoadRKjcxxCountMap(){
        synchronized (rkjcxxCountMap){
            return  rkjcxxCountMap;
        }
    }

    @Override
    public void run() {
        logger.info("====定时器================"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        loadRKjcxxCountMap();

    }


    /**
     * 异步方式刷新缓存
     */
    public void refreshCacheAsyc() {
        new Thread(this).start();
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        refreshCacheAsyc();
    }


}
