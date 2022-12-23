package org.museframework.bian.fraudmodel.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestFunctionalRequirementsRequest {
    @MetaField
    private String fraudmodelid;

    @MetaField
    private String functionalrequirementsid;

    @MetaField(ref=true)
    private org.museframework.bian.fraudmodel.dto.bq.FunctionalRequirements functionalRequirements;

    public void setFraudmodelid(String fraudmodelid) {
        this.fraudmodelid = fraudmodelid;
    }

    public String getFraudmodelid() {
        return fraudmodelid;
    }

    public void setFunctionalrequirementsid(String functionalrequirementsid) {
        this.functionalrequirementsid = functionalrequirementsid;
    }

    public String getFunctionalrequirementsid() {
        return functionalrequirementsid;
    }

    public void setFunctionalRequirements(org.museframework.bian.fraudmodel.dto.bq.FunctionalRequirements functionalRequirements) {
        this.functionalRequirements = functionalRequirements;
    }

    public org.museframework.bian.fraudmodel.dto.bq.FunctionalRequirements getFunctionalRequirements() {
        return functionalRequirements;
    }
}