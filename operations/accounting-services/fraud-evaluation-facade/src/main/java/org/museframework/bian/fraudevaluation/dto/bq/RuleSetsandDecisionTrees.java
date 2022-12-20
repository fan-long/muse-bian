/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.fraudevaluation.dto.bq;

public class RuleSetsandDecisionTrees {
    /*The production transaction assessment test results, including reference to any potential fraud transactions - note this can be a real-time dataset*/
    private String ruleSetsAndDecisionTreesTestResult;

    /*Work documentation, forms and schedules produced and referenced during the assessment task*/
    private String ruleSetsAndDecisionTreesTestWorkProduct;

    public void setRuleSetsAndDecisionTreesTestResult(String ruleSetsAndDecisionTreesTestResult) {
        this.ruleSetsAndDecisionTreesTestResult = ruleSetsAndDecisionTreesTestResult;
    }

    public String getRuleSetsAndDecisionTreesTestResult() {
        return ruleSetsAndDecisionTreesTestResult;
    }

    public void setRuleSetsAndDecisionTreesTestWorkProduct(String ruleSetsAndDecisionTreesTestWorkProduct) {
        this.ruleSetsAndDecisionTreesTestWorkProduct = ruleSetsAndDecisionTreesTestWorkProduct;
    }

    public String getRuleSetsAndDecisionTreesTestWorkProduct() {
        return ruleSetsAndDecisionTreesTestWorkProduct;
    }
}