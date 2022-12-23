package org.museframework.bian.productdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RegisterOperationsRequest {
    @MetaField
    private String productdirectoryid;

    @MetaField
    private String operationsid;

    @MetaField(ref=true)
    private org.museframework.bian.productdirectory.dto.bq.Operations operations;

    public void setProductdirectoryid(String productdirectoryid) {
        this.productdirectoryid = productdirectoryid;
    }

    public String getProductdirectoryid() {
        return productdirectoryid;
    }

    public void setOperationsid(String operationsid) {
        this.operationsid = operationsid;
    }

    public String getOperationsid() {
        return operationsid;
    }

    public void setOperations(org.museframework.bian.productdirectory.dto.bq.Operations operations) {
        this.operations = operations;
    }

    public org.museframework.bian.productdirectory.dto.bq.Operations getOperations() {
        return operations;
    }
}