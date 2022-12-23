package org.museframework.bian.salesproduct.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluateOperationalTermRequest {
    @MetaField
    private String salesproductid;

    @MetaField
    private String operationaltermid;

    @MetaField(ref=true)
    private org.museframework.bian.salesproduct.dto.bq.OperationalTerm operationalTerm;

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

    public void setOperationalTerm(org.museframework.bian.salesproduct.dto.bq.OperationalTerm operationalTerm) {
        this.operationalTerm = operationalTerm;
    }

    public org.museframework.bian.salesproduct.dto.bq.OperationalTerm getOperationalTerm() {
        return operationalTerm;
    }
}