/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.frauddiagnosis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AnalystReview {
    /*Reference to the customer, extracted from the financial transaction details, used to access customer details*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to an outbound contact established with the customer*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object outboundContactReference;

    /*The result of the economic model, including the recommended response*/
    @MetaField
    private String analystReviewAnalysisResult;

    /*Work documentation, forms and schedules produced and referenced during the analysis (for future reference)*/
    @MetaField
    private String analystReviewWorkProduct;

    /*The recommended action resulting from the analysts review*/
    @MetaField
    private String analystReviewRecommendedAction;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setOutboundContactReference(org.museframework.bian.classes.Object outboundContactReference) {
        this.outboundContactReference = outboundContactReference;
    }

    public org.museframework.bian.classes.Object getOutboundContactReference() {
        return outboundContactReference;
    }

    public void setAnalystReviewAnalysisResult(String analystReviewAnalysisResult) {
        this.analystReviewAnalysisResult = analystReviewAnalysisResult;
    }

    public String getAnalystReviewAnalysisResult() {
        return analystReviewAnalysisResult;
    }

    public void setAnalystReviewWorkProduct(String analystReviewWorkProduct) {
        this.analystReviewWorkProduct = analystReviewWorkProduct;
    }

    public String getAnalystReviewWorkProduct() {
        return analystReviewWorkProduct;
    }

    public void setAnalystReviewRecommendedAction(String analystReviewRecommendedAction) {
        this.analystReviewRecommendedAction = analystReviewRecommendedAction;
    }

    public String getAnalystReviewRecommendedAction() {
        return analystReviewRecommendedAction;
    }
}