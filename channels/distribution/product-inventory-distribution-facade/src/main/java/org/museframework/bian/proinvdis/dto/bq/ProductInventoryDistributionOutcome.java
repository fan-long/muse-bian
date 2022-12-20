/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Product Inventory Distribution. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.proinvdis.dto.bq;

public class ProductInventoryDistributionOutcome {
    /**/
    private String productInventoryDistributionPerformanceAnalysis;

    /**/
    private String productInventoryDistributionActivityAnalysis;

    /**/
    private String productInventoryDistributionAdministrativePlan;

    /**/
    private String productInventoryDistributionAdministrationTask;

    public void setProductInventoryDistributionPerformanceAnalysis(String productInventoryDistributionPerformanceAnalysis) {
        this.productInventoryDistributionPerformanceAnalysis = productInventoryDistributionPerformanceAnalysis;
    }

    public String getProductInventoryDistributionPerformanceAnalysis() {
        return productInventoryDistributionPerformanceAnalysis;
    }

    public void setProductInventoryDistributionActivityAnalysis(String productInventoryDistributionActivityAnalysis) {
        this.productInventoryDistributionActivityAnalysis = productInventoryDistributionActivityAnalysis;
    }

    public String getProductInventoryDistributionActivityAnalysis() {
        return productInventoryDistributionActivityAnalysis;
    }

    public void setProductInventoryDistributionAdministrativePlan(String productInventoryDistributionAdministrativePlan) {
        this.productInventoryDistributionAdministrativePlan = productInventoryDistributionAdministrativePlan;
    }

    public String getProductInventoryDistributionAdministrativePlan() {
        return productInventoryDistributionAdministrativePlan;
    }

    public void setProductInventoryDistributionAdministrationTask(String productInventoryDistributionAdministrationTask) {
        this.productInventoryDistributionAdministrationTask = productInventoryDistributionAdministrationTask;
    }

    public String getProductInventoryDistributionAdministrationTask() {
        return productInventoryDistributionAdministrationTask;
    }
}