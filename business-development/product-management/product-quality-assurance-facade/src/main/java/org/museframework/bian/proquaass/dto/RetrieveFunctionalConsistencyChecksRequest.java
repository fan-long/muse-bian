package org.museframework.bian.proquaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFunctionalConsistencyChecksRequest {
    @MetaField
    private String productqualityassuranceid;

    @MetaField
    private String functionalconsistencychecksid;

    public void setProductqualityassuranceid(String productqualityassuranceid) {
        this.productqualityassuranceid = productqualityassuranceid;
    }

    public String getProductqualityassuranceid() {
        return productqualityassuranceid;
    }

    public void setFunctionalconsistencychecksid(String functionalconsistencychecksid) {
        this.functionalconsistencychecksid = functionalconsistencychecksid;
    }

    public String getFunctionalconsistencychecksid() {
        return functionalconsistencychecksid;
    }
}