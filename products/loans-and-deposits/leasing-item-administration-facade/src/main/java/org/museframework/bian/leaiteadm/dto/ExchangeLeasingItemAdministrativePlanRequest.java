package org.museframework.bian.leaiteadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeLeasingItemAdministrativePlanRequest {
    @MetaField
    private String leasingitemadministrationid;

    @MetaField(ref=true)
    private org.museframework.bian.leaiteadm.dto.cr.LeasingItemAdministrativePlan leasingItemAdministrativePlan;

    public void setLeasingitemadministrationid(String leasingitemadministrationid) {
        this.leasingitemadministrationid = leasingitemadministrationid;
    }

    public String getLeasingitemadministrationid() {
        return leasingitemadministrationid;
    }

    public void setLeasingItemAdministrativePlan(org.museframework.bian.leaiteadm.dto.cr.LeasingItemAdministrativePlan leasingItemAdministrativePlan) {
        this.leasingItemAdministrativePlan = leasingItemAdministrativePlan;
    }

    public org.museframework.bian.leaiteadm.dto.cr.LeasingItemAdministrativePlan getLeasingItemAdministrativePlan() {
        return leasingItemAdministrativePlan;
    }
}