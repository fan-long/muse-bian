package org.museframework.bian.salesproduct.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveOperationalTermRequest {
    @MetaField
    private String salesproductid;

    @MetaField
    private String operationaltermid;

    public void setSalesproductid(String salesproductid) {
        this.salesproductid = salesproductid;
    }

    public String getSalesproductid() {
        return salesproductid;
    }

    public void setOperationaltermid(String operationaltermid) {
        this.operationaltermid = operationaltermid;
    }

    public String getOperationaltermid() {
        return operationaltermid;
    }
}