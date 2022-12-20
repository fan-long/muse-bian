package org.museframework.bian.fraudevaluation.dto;

public class RetrieveRuleSetsandDecisionTreesResponse {
    private org.museframework.bian.fraudevaluation.dto.bq.RuleSetsandDecisionTrees ruleSetsandDecisionTrees;

    public void setRuleSetsandDecisionTrees(org.museframework.bian.fraudevaluation.dto.bq.RuleSetsandDecisionTrees ruleSetsandDecisionTrees) {
        this.ruleSetsandDecisionTrees = ruleSetsandDecisionTrees;
    }

    public org.museframework.bian.fraudevaluation.dto.bq.RuleSetsandDecisionTrees getRuleSetsandDecisionTrees() {
        return ruleSetsandDecisionTrees;
    }
}