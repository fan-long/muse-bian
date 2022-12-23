package org.museframework.bian.fraudevaluation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveRuleSetsandDecisionTreesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fraudevaluation.dto.bq.RuleSetsandDecisionTrees ruleSetsandDecisionTrees;

    public void setRuleSetsandDecisionTrees(org.museframework.bian.fraudevaluation.dto.bq.RuleSetsandDecisionTrees ruleSetsandDecisionTrees) {
        this.ruleSetsandDecisionTrees = ruleSetsandDecisionTrees;
    }

    public org.museframework.bian.fraudevaluation.dto.bq.RuleSetsandDecisionTrees getRuleSetsandDecisionTrees() {
        return ruleSetsandDecisionTrees;
    }
}