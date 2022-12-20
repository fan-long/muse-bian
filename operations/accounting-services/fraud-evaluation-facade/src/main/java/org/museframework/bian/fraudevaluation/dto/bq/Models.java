/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.fraudevaluation.dto.bq;

public class Models {
    /*The production transaction assessment test results, including reference to any potential fraud transactions - note this can be a real-time dataset*/
    private String modelsTestResult;

    /*Work documentation, forms and schedules produced and referenced during the assessment task*/
    private String modelsTestWorkProduct;

    public void setModelsTestResult(String modelsTestResult) {
        this.modelsTestResult = modelsTestResult;
    }

    public String getModelsTestResult() {
        return modelsTestResult;
    }

    public void setModelsTestWorkProduct(String modelsTestWorkProduct) {
        this.modelsTestWorkProduct = modelsTestWorkProduct;
    }

    public String getModelsTestWorkProduct() {
        return modelsTestWorkProduct;
    }
}