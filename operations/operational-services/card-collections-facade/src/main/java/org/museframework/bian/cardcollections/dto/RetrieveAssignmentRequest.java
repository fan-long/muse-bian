package org.museframework.bian.cardcollections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAssignmentRequest {
    @MetaField
    private String cardcollectionsid;

    @MetaField
    private String assignmentid;

    public void setCardcollectionsid(String cardcollectionsid) {
        this.cardcollectionsid = cardcollectionsid;
    }

    public String getCardcollectionsid() {
        return cardcollectionsid;
    }

    public void setAssignmentid(String assignmentid) {
        this.assignmentid = assignmentid;
    }

    public String getAssignmentid() {
        return assignmentid;
    }
}