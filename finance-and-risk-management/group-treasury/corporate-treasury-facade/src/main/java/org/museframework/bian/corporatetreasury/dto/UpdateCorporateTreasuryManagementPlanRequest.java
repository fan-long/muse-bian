package org.museframework.bian.corporatetreasury.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCorporateTreasuryManagementPlanRequest {
    @MetaField
    private String corporatetreasuryid;

    @MetaField(ref=true)
    private org.museframework.bian.corporatetreasury.dto.cr.CorporateTreasuryManagementPlan corporateTreasuryManagementPlan;

    public void setCorporatetreasuryid(String corporatetreasuryid) {
        this.corporatetreasuryid = corporatetreasuryid;
    }

    public String getCorporatetreasuryid() {
        return corporatetreasuryid;
    }

    public void setCorporateTreasuryManagementPlan(org.museframework.bian.corporatetreasury.dto.cr.CorporateTreasuryManagementPlan corporateTreasuryManagementPlan) {
        this.corporateTreasuryManagementPlan = corporateTreasuryManagementPlan;
    }

    public org.museframework.bian.corporatetreasury.dto.cr.CorporateTreasuryManagementPlan getCorporateTreasuryManagementPlan() {
        return corporateTreasuryManagementPlan;
    }
}