package org.museframework.bian.cusbehmod.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateFunctionalRequirementsRequest {
    @MetaField
    private String customerbehaviormodelsid;

    @MetaField
    private String functionalrequirementsid;

    @MetaField(ref=true)
    private org.museframework.bian.cusbehmod.dto.bq.FunctionalRequirements functionalRequirements;

    public void setCustomerbehaviormodelsid(String customerbehaviormodelsid) {
        this.customerbehaviormodelsid = customerbehaviormodelsid;
    }

    public String getCustomerbehaviormodelsid() {
        return customerbehaviormodelsid;
    }

    public void setFunctionalrequirementsid(String functionalrequirementsid) {
        this.functionalrequirementsid = functionalrequirementsid;
    }

    public String getFunctionalrequirementsid() {
        return functionalrequirementsid;
    }

    public void setFunctionalRequirements(org.museframework.bian.cusbehmod.dto.bq.FunctionalRequirements functionalRequirements) {
        this.functionalRequirements = functionalRequirements;
    }

    public org.museframework.bian.cusbehmod.dto.bq.FunctionalRequirements getFunctionalRequirements() {
        return functionalRequirements;
    }
}