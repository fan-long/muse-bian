package org.museframework.bian.productdesign.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureFunctionalRequirementsRequest {
    @MetaField
    private String productdesignid;

    @MetaField
    private String functionalrequirementsid;

    @MetaField(ref=true)
    private org.museframework.bian.productdesign.dto.bq.FunctionalRequirements functionalRequirements;

    public void setProductdesignid(String productdesignid) {
        this.productdesignid = productdesignid;
    }

    public String getProductdesignid() {
        return productdesignid;
    }

    public void setFunctionalrequirementsid(String functionalrequirementsid) {
        this.functionalrequirementsid = functionalrequirementsid;
    }

    public String getFunctionalrequirementsid() {
        return functionalrequirementsid;
    }

    public void setFunctionalRequirements(org.museframework.bian.productdesign.dto.bq.FunctionalRequirements functionalRequirements) {
        this.functionalRequirements = functionalRequirements;
    }

    public org.museframework.bian.productdesign.dto.bq.FunctionalRequirements getFunctionalRequirements() {
        return functionalRequirements;
    }
}