/*Create and maintain a design for a procedure, product/service model or other such entity  within Public Reference Data Management. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.pubrefdatman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PublicReferenceDataManagementOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object publicReferenceDataManagementTask;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object publicReferenceDataManagementDesign;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object publicReferenceDataManagementWorkProduct;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object publicReferenceDataManagementImpactAnalysis;

    public void setPublicReferenceDataManagementTask(org.museframework.bian.classes.Object publicReferenceDataManagementTask) {
        this.publicReferenceDataManagementTask = publicReferenceDataManagementTask;
    }

    public org.museframework.bian.classes.Object getPublicReferenceDataManagementTask() {
        return publicReferenceDataManagementTask;
    }

    public void setPublicReferenceDataManagementDesign(org.museframework.bian.classes.Object publicReferenceDataManagementDesign) {
        this.publicReferenceDataManagementDesign = publicReferenceDataManagementDesign;
    }

    public org.museframework.bian.classes.Object getPublicReferenceDataManagementDesign() {
        return publicReferenceDataManagementDesign;
    }

    public void setPublicReferenceDataManagementWorkProduct(org.museframework.bian.classes.Object publicReferenceDataManagementWorkProduct) {
        this.publicReferenceDataManagementWorkProduct = publicReferenceDataManagementWorkProduct;
    }

    public org.museframework.bian.classes.Object getPublicReferenceDataManagementWorkProduct() {
        return publicReferenceDataManagementWorkProduct;
    }

    public void setPublicReferenceDataManagementImpactAnalysis(org.museframework.bian.classes.Object publicReferenceDataManagementImpactAnalysis) {
        this.publicReferenceDataManagementImpactAnalysis = publicReferenceDataManagementImpactAnalysis;
    }

    public org.museframework.bian.classes.Object getPublicReferenceDataManagementImpactAnalysis() {
        return publicReferenceDataManagementImpactAnalysis;
    }
}