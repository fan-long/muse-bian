package org.museframework.bian.intrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestBankRelationshipManagementPlanRequest {
    @MetaField
    private String interbankrelationshipmanagementid;

    @MetaField(ref=true)
    private org.museframework.bian.intrelman.dto.cr.BankRelationshipManagementPlan bankRelationshipManagementPlan;

    public void setInterbankrelationshipmanagementid(String interbankrelationshipmanagementid) {
        this.interbankrelationshipmanagementid = interbankrelationshipmanagementid;
    }

    public String getInterbankrelationshipmanagementid() {
        return interbankrelationshipmanagementid;
    }

    public void setBankRelationshipManagementPlan(org.museframework.bian.intrelman.dto.cr.BankRelationshipManagementPlan bankRelationshipManagementPlan) {
        this.bankRelationshipManagementPlan = bankRelationshipManagementPlan;
    }

    public org.museframework.bian.intrelman.dto.cr.BankRelationshipManagementPlan getBankRelationshipManagementPlan() {
        return bankRelationshipManagementPlan;
    }
}