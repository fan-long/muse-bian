package org.museframework.bian.fraudevaluation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveRuleSetsandDecisionTreesRequest {
    @MetaField
    private String fraudevaluationid;

    @MetaField
    private String rulesetsanddecisiontreesid;

    public void setFraudevaluationid(String fraudevaluationid) {
        this.fraudevaluationid = fraudevaluationid;
    }

    public String getFraudevaluationid() {
        return fraudevaluationid;
    }

    public void setRulesetsanddecisiontreesid(String rulesetsanddecisiontreesid) {
        this.rulesetsanddecisiontreesid = rulesetsanddecisiontreesid;
    }

    public String getRulesetsanddecisiontreesid() {
        return rulesetsanddecisiontreesid;
    }
}