package com.example.demo.log;

import com.example.demo.entity.AnalysisLog;

public class MyLogger {

    public void info(String msg){
        System.out.println(msg+ AnalysisLog.getCurrentAnalysis());
    }

}
