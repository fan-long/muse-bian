/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.frauddiagnosis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CustomerBehavior extends org.museframework.bian.classes.CustomerBehavior {
    /*The production transaction customer behavior analysis results*/
    @MetaField
    private String customerBehaviorAnalysisResult;

    /*Work documentation, forms and schedules produced and referenced during the analysis (for future reference)*/
    @MetaField
    private String customerBehaviorAnalysisWorkProduct;

    public void setCustomerBehaviorAnalysisResult(String customerBehaviorAnalysisResult) {
        this.customerBehaviorAnalysisResult = customerBehaviorAnalysisResult;
    }

    public String getCustomerBehaviorAnalysisResult() {
        return customerBehaviorAnalysisResult;
    }

    public void setCustomerBehaviorAnalysisWorkProduct(String customerBehaviorAnalysisWorkProduct) {
        this.customerBehaviorAnalysisWorkProduct = customerBehaviorAnalysisWorkProduct;
    }

    public String getCustomerBehaviorAnalysisWorkProduct() {
        return customerBehaviorAnalysisWorkProduct;
    }
}