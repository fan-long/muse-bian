package org.museframework.bian.consumerinvestments.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveComplianceRequest {
    @MetaField
    private String consumerinvestmentsid;

    @MetaField
    private String complianceid;

    public void setConsumerinvestmentsid(String consumerinvestmentsid) {
        this.consumerinvestmentsid = consumerinvestmentsid;
    }

    public String getConsumerinvestmentsid() {
        return consumerinvestmentsid;
    }

    public void setComplianceid(String complianceid) {
        this.complianceid = complianceid;
    }

    public String getComplianceid() {
        return complianceid;
    }
}