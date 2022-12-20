package org.museframework.bian.knowledgeexchange.dto;

public class RetrieveCaptureandClassificationRequest {
    private String knowledgeexchangeid;

    private String captureandclassificationid;

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
}