/*Create and maintain a design for a procedure, product/service model or other such entity  within Management Manual. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.managementmanual.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ManagementManualOutcome {
    /**/
    @MetaField(0)
    private String managementManualTask;

    /**/
    @MetaField(0)
    private String managementManualDesign;

    /**/
    @MetaField(0)
    private String managementManualWorkProduct;

    /**/
    @MetaField(0)
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