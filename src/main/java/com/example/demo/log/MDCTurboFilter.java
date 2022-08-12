package com.example.demo.log;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.turbo.TurboFilter;
import ch.qos.logback.core.spi.FilterReply;
import com.example.demo.entity.AnalysisLog;
import org.slf4j.Marker;

public class MDCTurboFilter extends TurboFilter {
    @Override
    public FilterReply decide(Marker marker, Logger logger, Level level, String s, Object[] objects, Throwable throwable) {
        if (logger.getName().startsWith("com.example.demo.service")){
            System.out.println("CurrentAnalysis:"+AnalysisLog.getCurrentAnalysis());
        }
        return FilterReply.NEUTRAL;
    }
}
