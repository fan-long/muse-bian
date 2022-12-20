package org.museframework.bian.cuscamexe.dto;

public class InitiateAnalysisFeedbackResponse {
    private org.museframework.bian.cuscamexe.dto.bq.AnalysisFeedback analysisFeedback;

    public void setAnalysisFeedback(org.museframework.bian.cuscamexe.dto.bq.AnalysisFeedback analysisFeedback) {
        this.analysisFeedback = analysisFeedback;
    }

    public org.museframework.bian.cuscamexe.dto.bq.AnalysisFeedback getAnalysisFeedback() {
        return analysisFeedback;
    }
}