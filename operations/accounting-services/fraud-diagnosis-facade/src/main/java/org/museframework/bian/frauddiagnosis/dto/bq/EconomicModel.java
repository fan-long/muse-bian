/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.frauddiagnosis.dto.bq;

public class EconomicModel {
    /*The result of the economic model, including the recommended response*/
    private String economicModelAnalysisResult;

    /*Work documentation, forms and schedules produced and referenced during the analysis (for future reference)*/
    private String economicModelWorkProduct;

    public void setEconomicModelAnalysisResult(String economicModelAnalysisResult) {
        this.economicModelAnalysisResult = economicModelAnalysisResult;
    }

    public String getEconomicModelAnalysisResult() {
        return economicModelAnalysisResult;
    }

    public void setEconomicModelWorkProduct(String economicModelWorkProduct) {
        this.economicModelWorkProduct = economicModelWorkProduct;
    }

    public String getEconomicModelWorkProduct() {
        return economicModelWorkProduct;
    }
}