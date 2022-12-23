package org.museframework.bian.proquaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateUsabilityChecksRequest {
    @MetaField
    private String productqualityassuranceid;

    @MetaField
    private String usabilitychecksid;

    @MetaField(ref=true)
    private org.museframework.bian.proquaass.dto.bq.UsabilityChecks usabilityChecks;

    public void setProductqualityassuranceid(String productqualityassuranceid) {
        this.productqualityassuranceid = productqualityassuranceid;
    }

    public String getProductqualityassuranceid() {
        return productqualityassuranceid;
    }

    public void setUsabilitychecksid(String usabilitychecksid) {
        this.usabilitychecksid = usabilitychecksid;
    }

    public String getUsabilitychecksid() {
        return usabilitychecksid;
    }

    public void setUsabilityChecks(org.museframework.bian.proquaass.dto.bq.UsabilityChecks usabilityChecks) {
        this.usabilityChecks = usabilityChecks;
    }

    public org.museframework.bian.proquaass.dto.bq.UsabilityChecks getUsabilityChecks() {
        return usabilityChecks;
    }
}