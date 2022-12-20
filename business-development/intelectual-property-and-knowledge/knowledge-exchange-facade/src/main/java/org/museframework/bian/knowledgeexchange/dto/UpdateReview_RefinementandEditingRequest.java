package org.museframework.bian.knowledgeexchange.dto;

public class UpdateReview_RefinementandEditingRequest {
    private String knowledgeexchangeid;

    private String review_refinementandeditingid;

    private org.museframework.bian.knowledgeexchange.dto.bq.Review_RefinementandEditing review_RefinementandEditing;

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

    public void setReview_RefinementandEditing(org.museframework.bian.knowledgeexchange.dto.bq.Review_RefinementandEditing review_RefinementandEditing) {
        this.review_RefinementandEditing = review_RefinementandEditing;
    }

    public org.museframework.bian.knowledgeexchange.dto.bq.Review_RefinementandEditing getReview_RefinementandEditing() {
        return review_RefinementandEditing;
    }
}