package org.museframework.bian.proexpsalsup.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAssignmentRequest {
    @MetaField
    private String productexpertsalessupportid;

    @MetaField
    private String assignmentid;

    public void setProductexpertsalessupportid(String productexpertsalessupportid) {
        this.productexpertsalessupportid = productexpertsalessupportid;
    }

    public String getProductexpertsalessupportid() {
        return productexpertsalessupportid;
    }

    public void setAssignmentid(String assignmentid) {
        this.assignmentid = assignmentid;
    }

    public String getAssignmentid() {
        return assignmentid;
    }
}