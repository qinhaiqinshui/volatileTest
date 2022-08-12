package com.example.demo.service;

import com.example.demo.entity.AnalysisLog;
import com.example.demo.log.MyLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    private Logger logger= LoggerFactory.getLogger(this.getClass());
    private MyLogger myLogger=new MyLogger();
    @Async
    public void go(){
        AnalysisLog analysisLog=new AnalysisLog();
        analysisLog.setId(111L);
        AnalysisLog.setCurrentAnalysis(analysisLog);
        logger.info("开始记录");
        myLogger.info("mylog开始:");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logger.info("完成");
        myLogger.info("mylog完成:");
    }

}
