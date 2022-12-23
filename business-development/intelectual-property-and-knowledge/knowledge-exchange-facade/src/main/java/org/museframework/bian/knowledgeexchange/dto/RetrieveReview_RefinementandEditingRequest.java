package org.museframework.bian.knowledgeexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveReview_RefinementandEditingRequest {
    @MetaField
    private String knowledgeexchangeid;

    @MetaField
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