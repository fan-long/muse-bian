package org.museframework.bian.concenope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAssignmentRequest {
    @MetaField
    private String contactcenteroperationsid;

    @MetaField
    private String assignmentid;

    @MetaField(ref=true)
    private org.museframework.bian.concenope.dto.bq.Assignment assignment;

    public void setContactcenteroperationsid(String contactcenteroperationsid) {
        this.contactcenteroperationsid = contactcenteroperationsid;
    }

    public String getContactcenteroperationsid() {
        return contactcenteroperationsid;
    }

    public void setAssignmentid(String assignmentid) {
        this.assignmentid = assignmentid;
    }

    public String getAssignmentid() {
        return assignmentid;
    }

    public void setAssignment(org.museframework.bian.concenope.dto.bq.Assignment assignment) {
        this.assignment = assignment;
    }

    public org.museframework.bian.concenope.dto.bq.Assignment getAssignment() {
        return assignment;
    }
}