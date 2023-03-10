/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.frauddiagnosis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class EconomicModel {
    /*The result of the economic model, including the recommended response*/
    @MetaField(0)
    private String economicModelAnalysisResult;

    /*Work documentation, forms and schedules produced and referenced during the analysis (for future reference)*/
    @MetaField(0)
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