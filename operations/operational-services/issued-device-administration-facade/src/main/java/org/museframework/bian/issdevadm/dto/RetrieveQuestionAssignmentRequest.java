package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveQuestionAssignmentRequest {
    @MetaField
    private String issueddeviceadministrationid;

    @MetaField
    private String questionassignmentid;

    public void setIssueddeviceadministrationid(String issueddeviceadministrationid) {
        this.issueddeviceadministrationid = issueddeviceadministrationid;
    }

    public String getIssueddeviceadministrationid() {
        return issueddeviceadministrationid;
    }

    public void setQuestionassignmentid(String questionassignmentid) {
        this.questionassignmentid = questionassignmentid;
    }

    public String getQuestionassignmentid() {
        return questionassignmentid;
    }
}