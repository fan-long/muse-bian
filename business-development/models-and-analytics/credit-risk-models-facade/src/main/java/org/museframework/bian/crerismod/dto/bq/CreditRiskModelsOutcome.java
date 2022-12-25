/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.crerismod.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CreditRiskModelsOutcome {
    /**/
    @MetaField(0)
    private String creditRiskModelsTask;

    /**/
    @MetaField(0)
    private String creditRiskModelsDesign;

    /**/
    @MetaField(0)
    private String creditRiskModelsWorkProduct;

    /**/
    @MetaField(0)
    private String creditRiskModelsImpactAnalysis;

    public void setCreditRiskModelsTask(String creditRiskModelsTask) {
        this.creditRiskModelsTask = creditRiskModelsTask;
    }

    public String getCreditRiskModelsTask() {
        return creditRiskModelsTask;
    }

    public void setCreditRiskModelsDesign(String creditRiskModelsDesign) {
        this.creditRiskModelsDesign = creditRiskModelsDesign;
    }

    public String getCreditRiskModelsDesign() {
        return creditRiskModelsDesign;
    }

    public void setCreditRiskModelsWorkProduct(String creditRiskModelsWorkProduct) {
        this.creditRiskModelsWorkProduct = creditRiskModelsWorkProduct;
    }

    public String getCreditRiskModelsWorkProduct() {
        return creditRiskModelsWorkProduct;
    }

    public void setCreditRiskModelsImpactAnalysis(String creditRiskModelsImpactAnalysis) {
        this.creditRiskModelsImpactAnalysis = creditRiskModelsImpactAnalysis;
    }

    public String getCreditRiskModelsImpactAnalysis() {
        return creditRiskModelsImpactAnalysis;
    }
}