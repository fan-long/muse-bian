/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.itstaandgui.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ITStandardsAndGuidelinesOutcome {
    /**/
    @MetaField(0)
    private String ITStandardsAndGuidelinesTask;

    /**/
    @MetaField(0)
    private String ITStandardsAndGuidelinesDesign;

    /**/
    @MetaField(0)
    private String ITStandardsAndGuidelinesWorkProduct;

    /**/
    @MetaField(0)
    private String ITStandardsAndGuidelinesImpactAnalysis;

    public void setITStandardsAndGuidelinesTask(String ITStandardsAndGuidelinesTask) {
        this.ITStandardsAndGuidelinesTask = ITStandardsAndGuidelinesTask;
    }

    public String getITStandardsAndGuidelinesTask() {
        return ITStandardsAndGuidelinesTask;
    }

    public void setITStandardsAndGuidelinesDesign(String ITStandardsAndGuidelinesDesign) {
        this.ITStandardsAndGuidelinesDesign = ITStandardsAndGuidelinesDesign;
    }

    public String getITStandardsAndGuidelinesDesign() {
        return ITStandardsAndGuidelinesDesign;
    }

    public void setITStandardsAndGuidelinesWorkProduct(String ITStandardsAndGuidelinesWorkProduct) {
        this.ITStandardsAndGuidelinesWorkProduct = ITStandardsAndGuidelinesWorkProduct;
    }

    public String getITStandardsAndGuidelinesWorkProduct() {
        return ITStandardsAndGuidelinesWorkProduct;
    }

    public void setITStandardsAndGuidelinesImpactAnalysis(String ITStandardsAndGuidelinesImpactAnalysis) {
        this.ITStandardsAndGuidelinesImpactAnalysis = ITStandardsAndGuidelinesImpactAnalysis;
    }

    public String getITStandardsAndGuidelinesImpactAnalysis() {
        return ITStandardsAndGuidelinesImpactAnalysis;
    }
}