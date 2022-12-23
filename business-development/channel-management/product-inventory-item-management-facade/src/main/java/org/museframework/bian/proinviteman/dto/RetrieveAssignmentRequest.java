package org.museframework.bian.proinviteman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAssignmentRequest {
    @MetaField
    private String productinventoryitemmanagementid;

    @MetaField
    private String assignmentid;

    public void setProductinventoryitemmanagementid(String productinventoryitemmanagementid) {
        this.productinventoryitemmanagementid = productinventoryitemmanagementid;
    }

    public String getProductinventoryitemmanagementid() {
        return productinventoryitemmanagementid;
    }

    public void setAssignmentid(String assignmentid) {
        this.assignmentid = assignmentid;
    }

    public String getAssignmentid() {
        return assignmentid;
    }
}