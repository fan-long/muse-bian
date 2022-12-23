package org.museframework.bian.crerismod.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureFunctionalRequirementsRequest {
    @MetaField
    private String creditriskmodelsid;

    @MetaField
    private String functionalrequirementsid;

    @MetaField(ref=true)
    private org.museframework.bian.crerismod.dto.bq.FunctionalRequirements functionalRequirements;

    public void setCreditriskmodelsid(String creditriskmodelsid) {
        this.creditriskmodelsid = creditriskmodelsid;
    }

    public String getCreditriskmodelsid() {
        return creditriskmodelsid;
    }

    public void setFunctionalrequirementsid(String functionalrequirementsid) {
        this.functionalrequirementsid = functionalrequirementsid;
    }

    public String getFunctionalrequirementsid() {
        return functionalrequirementsid;
    }

    public void setFunctionalRequirements(org.museframework.bian.crerismod.dto.bq.FunctionalRequirements functionalRequirements) {
        this.functionalRequirements = functionalRequirements;
    }

    public org.museframework.bian.crerismod.dto.bq.FunctionalRequirements getFunctionalRequirements() {
        return functionalRequirements;
    }
}