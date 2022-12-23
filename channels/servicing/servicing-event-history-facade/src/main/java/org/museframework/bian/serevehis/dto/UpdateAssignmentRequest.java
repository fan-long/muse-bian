package org.museframework.bian.serevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAssignmentRequest {
    @MetaField
    private String servicingeventhistoryid;

    @MetaField
    private String assignmentid;

    @MetaField(ref=true)
    private org.museframework.bian.serevehis.dto.bq.Assignment assignment;

    public void setServicingeventhistoryid(String servicingeventhistoryid) {
        this.servicingeventhistoryid = servicingeventhistoryid;
    }

    public String getServicingeventhistoryid() {
        return servicingeventhistoryid;
    }

    public void setAssignmentid(String assignmentid) {
        this.assignmentid = assignmentid;
    }

    public String getAssignmentid() {
        return assignmentid;
    }

    public void setAssignment(org.museframework.bian.serevehis.dto.bq.Assignment assignment) {
        this.assignment = assignment;
    }

    public org.museframework.bian.serevehis.dto.bq.Assignment getAssignment() {
        return assignment;
    }
}