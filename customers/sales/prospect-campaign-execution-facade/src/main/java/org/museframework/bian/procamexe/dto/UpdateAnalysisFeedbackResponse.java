package org.museframework.bian.procamexe.dto;

public class UpdateAnalysisFeedbackResponse {
    private org.museframework.bian.procamexe.dto.bq.AnalysisFeedback analysisFeedback;

    public void setAnalysisFeedback(org.museframework.bian.procamexe.dto.bq.AnalysisFeedback analysisFeedback) {
        this.analysisFeedback = analysisFeedback;
    }

    public org.museframework.bian.procamexe.dto.bq.AnalysisFeedback getAnalysisFeedback() {
        return analysisFeedback;
    }
}