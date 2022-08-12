package com.example.demo.entity;

public class AnalysisLog {

    private static volatile  AnalysisLog currentAnalysis;
    public static AnalysisLog getCurrentAnalysis() {
        return currentAnalysis;
    }
    public static void setCurrentAnalysis(AnalysisLog currentAnalysis) {
        currentAnalysis = currentAnalysis;
    }

    private Long id;

    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
