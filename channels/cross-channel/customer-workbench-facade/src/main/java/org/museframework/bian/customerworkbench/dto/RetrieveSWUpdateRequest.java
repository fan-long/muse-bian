package org.museframework.bian.customerworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveSWUpdateRequest {
    @MetaField
    private String customerworkbenchid;

    @MetaField
    private String swupdateid;

    public void setCustomerworkbenchid(String customerworkbenchid) {
        this.customerworkbenchid = customerworkbenchid;
    }

    public String getCustomerworkbenchid() {
        return customerworkbenchid;
    }

    public void setSwupdateid(String swupdateid) {
        this.swupdateid = swupdateid;
    }

    public String getSwupdateid() {
        return swupdateid;
    }
}