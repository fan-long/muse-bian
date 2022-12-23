package org.museframework.bian.leaiteadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveValuationRequest {
    @MetaField
    private String leasingitemadministrationid;

    @MetaField
    private String valuationid;

    public void setLeasingitemadministrationid(String leasingitemadministrationid) {
        this.leasingitemadministrationid = leasingitemadministrationid;
    }

    public String getLeasingitemadministrationid() {
        return leasingitemadministrationid;
    }

    public void setValuationid(String valuationid) {
        this.valuationid = valuationid;
    }

    public String getValuationid() {
        return valuationid;
    }
}