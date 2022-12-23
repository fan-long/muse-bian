package org.museframework.bian.intpropor.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestAssignmentRequest {
    @MetaField
    private String intellectualpropertyportfolioid;

    @MetaField
    private String assignmentid;

    @MetaField(ref=true)
    private org.museframework.bian.intpropor.dto.bq.Assignment assignment;

    public void setIntellectualpropertyportfolioid(String intellectualpropertyportfolioid) {
        this.intellectualpropertyportfolioid = intellectualpropertyportfolioid;
    }

    public String getIntellectualpropertyportfolioid() {
        return intellectualpropertyportfolioid;
    }

    public void setAssignmentid(String assignmentid) {
        this.assignmentid = assignmentid;
    }

    public String getAssignmentid() {
        return assignmentid;
    }

    public void setAssignment(org.museframework.bian.intpropor.dto.bq.Assignment assignment) {
        this.assignment = assignment;
    }

    public org.museframework.bian.intpropor.dto.bq.Assignment getAssignment() {
        return assignment;
    }
}