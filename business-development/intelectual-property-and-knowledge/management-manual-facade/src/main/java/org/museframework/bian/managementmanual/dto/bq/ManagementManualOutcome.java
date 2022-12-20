/*Create and maintain a design for a procedure, product/service model or other such entity  within Management Manual. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.managementmanual.dto.bq;

public class ManagementManualOutcome {
    /**/
    private String managementManualTask;

    /**/
    private String managementManualDesign;

    /**/
    private String managementManualWorkProduct;

    /**/
    private String managementManualImpactAnalysis;

    public void setManagementManualTask(String managementManualTask) {
        this.managementManualTask = managementManualTask;
    }

    public String getManagementManualTask() {
        return managementManualTask;
    }

    public void setManagementManualDesign(String managementManualDesign) {
        this.managementManualDesign = managementManualDesign;
    }

    public String getManagementManualDesign() {
        return managementManualDesign;
    }

    public void setManagementManualWorkProduct(String managementManualWorkProduct) {
        this.managementManualWorkProduct = managementManualWorkProduct;
    }

    public String getManagementManualWorkProduct() {
        return managementManualWorkProduct;
    }

    public void setManagementManualImpactAnalysis(String managementManualImpactAnalysis) {
        this.managementManualImpactAnalysis = managementManualImpactAnalysis;
    }

    public String getManagementManualImpactAnalysis() {
        return managementManualImpactAnalysis;
    }
}