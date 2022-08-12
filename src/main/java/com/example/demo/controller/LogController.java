package com.example.demo.controller;

import com.example.demo.entity.AnalysisLog;
import com.example.demo.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @Autowired
    private LogService logService;

    @RequestMapping("/go")
    public String go(){
        logService.go();
        return "log object:"+ AnalysisLog.getCurrentAnalysis();
    }

}
