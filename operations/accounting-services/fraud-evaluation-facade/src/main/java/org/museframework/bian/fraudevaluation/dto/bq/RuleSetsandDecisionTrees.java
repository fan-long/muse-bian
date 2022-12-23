/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.fraudevaluation.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class RuleSetsandDecisionTrees {
    /*The production transaction assessment test results, including reference to any potential fraud transactions - note this can be a real-time dataset*/
    @MetaField
    private String ruleSetsAndDecisionTreesTestResult;

    /*Work documentation, forms and schedules produced and referenced during the assessment task*/
    @MetaField
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