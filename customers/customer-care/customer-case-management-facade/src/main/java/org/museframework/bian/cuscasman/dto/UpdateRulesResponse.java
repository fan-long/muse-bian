package org.museframework.bian.cuscasman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateRulesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cuscasman.dto.bq.Rules rules;

    public void setRules(org.museframework.bian.cuscasman.dto.bq.Rules rules) {
        this.rules = rules;
    }

    public org.museframework.bian.cuscasman.dto.bq.Rules getRules() {
        return rules;
    }
}