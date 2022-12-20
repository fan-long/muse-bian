/*The fulfilment of a Tax Optimization Advisory Service Arrangement*/
package org.museframework.bian.classes;

public class TaxOptimizationAdvisoryServiceArrangementFulfillmentEvent {
    /**/
    private String adviceServiceAppliedCharge;

    /**/
    private String adviceServiceRecommendation;

    /**/
    private String adviceServiceResult;

    public void setAdviceServiceAppliedCharge(String adviceServiceAppliedCharge) {
        this.adviceServiceAppliedCharge = adviceServiceAppliedCharge;
    }

    public String getAdviceServiceAppliedCharge() {
        return adviceServiceAppliedCharge;
    }

    public void setAdviceServiceRecommendation(String adviceServiceRecommendation) {
        this.adviceServiceRecommendation = adviceServiceRecommendation;
    }

    public String getAdviceServiceRecommendation() {
        return adviceServiceRecommendation;
    }

    public void setAdviceServiceResult(String adviceServiceResult) {
        this.adviceServiceResult = adviceServiceResult;
    }

    public String getAdviceServiceResult() {
        return adviceServiceResult;
    }
}