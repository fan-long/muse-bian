package org.museframework.bian.productdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveOperationsRequest {
    @MetaField
    private String productdirectoryid;

    @MetaField
    private String operationsid;

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
}