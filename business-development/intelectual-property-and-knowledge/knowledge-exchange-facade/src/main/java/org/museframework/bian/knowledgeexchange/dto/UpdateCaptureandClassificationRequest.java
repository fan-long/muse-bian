package org.museframework.bian.knowledgeexchange.dto;

public class UpdateCaptureandClassificationRequest {
    private String knowledgeexchangeid;

    private String captureandclassificationid;

    private org.museframework.bian.knowledgeexchange.dto.bq.CaptureandClassification captureandClassification;

    public void setKnowledgeexchangeid(String knowledgeexchangeid) {
        this.knowledgeexchangeid = knowledgeexchangeid;
    }

    public String getKnowledgeexchangeid() {
        return knowledgeexchangeid;
    }

    public void setCaptureandclassificationid(String captureandclassificationid) {
        this.captureandclassificationid = captureandclassificationid;
    }

    public String getCaptureandclassificationid() {
        return captureandclassificationid;
    }

    public void setCaptureandClassification(org.museframework.bian.knowledgeexchange.dto.bq.CaptureandClassification captureandClassification) {
        this.captureandClassification = captureandClassification;
    }

    public org.museframework.bian.knowledgeexchange.dto.bq.CaptureandClassification getCaptureandClassification() {
        return captureandClassification;
    }
}