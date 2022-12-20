package org.museframework.bian.knowledgeexchange.dto;

public class RetrieveReview_RefinementandEditingRequest {
    private String knowledgeexchangeid;

    private String review_refinementandeditingid;

    public void setKnowledgeexchangeid(String knowledgeexchangeid) {
        this.knowledgeexchangeid = knowledgeexchangeid;
    }

    public String getKnowledgeexchangeid() {
        return knowledgeexchangeid;
    }

    public void setReview_refinementandeditingid(String review_refinementandeditingid) {
        this.review_refinementandeditingid = review_refinementandeditingid;
    }

    public String getReview_refinementandeditingid() {
        return review_refinementandeditingid;
    }
}