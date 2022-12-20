package org.museframework.bian.fraudevaluation.dto;

public class RetrieveRuleSetsandDecisionTreesRequest {
    private String fraudevaluationid;

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