/*Create and maintain a design for a procedure, product/service model or other such entity  within Business Architecture. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.enterprisearchitecture.dto.bq;

public class EnterpriseArchitectureOutcome {
    /**/
    private String enterpriseArchitectureTask;

    /**/
    private String enterpriseArchitectureDesign;

    /**/
    private String enterpriseArchitectureWorkProduct;

    /**/
    private String enterpriseArchitectureImpactAnalysis;

    public void setEnterpriseArchitectureTask(String enterpriseArchitectureTask) {
        this.enterpriseArchitectureTask = enterpriseArchitectureTask;
    }

    public String getEnterpriseArchitectureTask() {
        return enterpriseArchitectureTask;
    }

    public void setEnterpriseArchitectureDesign(String enterpriseArchitectureDesign) {
        this.enterpriseArchitectureDesign = enterpriseArchitectureDesign;
    }

    public String getEnterpriseArchitectureDesign() {
        return enterpriseArchitectureDesign;
    }

    public void setEnterpriseArchitectureWorkProduct(String enterpriseArchitectureWorkProduct) {
        this.enterpriseArchitectureWorkProduct = enterpriseArchitectureWorkProduct;
    }

    public String getEnterpriseArchitectureWorkProduct() {
        return enterpriseArchitectureWorkProduct;
    }

    public void setEnterpriseArchitectureImpactAnalysis(String enterpriseArchitectureImpactAnalysis) {
        this.enterpriseArchitectureImpactAnalysis = enterpriseArchitectureImpactAnalysis;
    }

    public String getEnterpriseArchitectureImpactAnalysis() {
        return enterpriseArchitectureImpactAnalysis;
    }
}