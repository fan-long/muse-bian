/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Product Inventory Distribution. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.proinvdis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductInventoryDistributionOutcome {
    /**/
    @MetaField
    private String productInventoryDistributionPerformanceAnalysis;

    /**/
    @MetaField
    private String productInventoryDistributionActivityAnalysis;

    /**/
    @MetaField
    private String productInventoryDistributionAdministrativePlan;

    /**/
    @MetaField
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