/*Analyze the performance or behavior of some on-going activity or entity  within Financial Market Analysis. 
Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.

Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.*/
package org.museframework.bian.finmarana.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FinancialMarketInsight {
    /*The required status/situation before the algorithm can be applied*/
    @MetaField
    private String financialMarketInsightPreconditions;

    /*The schedule and timing of the analysis performed using the algorithm*/
    @MetaField
    private String financialMarketInsightAnalysisSchedule;

    /*The algorithm version employed in the analysis*/
    @MetaField
    private String financialMarketInsightVersionNumber;

    /*The Financial Market Analysis specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService financialMarketAnalysis;

    /*Reference to the specific business service type*/
    @MetaField
    private String financialMarketAnalysisServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String financialMarketAnalysisServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String financialMarketAnalysisServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String financialMarketAnalysisServiceWorkProduct;

    /**/
    @MetaField
    private String financialMarketAnalysisServiceName;

    public void setFinancialMarketInsightPreconditions(String financialMarketInsightPreconditions) {
        this.financialMarketInsightPreconditions = financialMarketInsightPreconditions;
    }

    public String getFinancialMarketInsightPreconditions() {
        return financialMarketInsightPreconditions;
    }

    public void setFinancialMarketInsightAnalysisSchedule(String financialMarketInsightAnalysisSchedule) {
        this.financialMarketInsightAnalysisSchedule = financialMarketInsightAnalysisSchedule;
    }

    public String getFinancialMarketInsightAnalysisSchedule() {
        return financialMarketInsightAnalysisSchedule;
    }

    public void setFinancialMarketInsightVersionNumber(String financialMarketInsightVersionNumber) {
        this.financialMarketInsightVersionNumber = financialMarketInsightVersionNumber;
    }

    public String getFinancialMarketInsightVersionNumber() {
        return financialMarketInsightVersionNumber;
    }

    public void setFinancialMarketAnalysis(org.museframework.bian.classes.BusinessService financialMarketAnalysis) {
        this.financialMarketAnalysis = financialMarketAnalysis;
    }

    public org.museframework.bian.classes.BusinessService getFinancialMarketAnalysis() {
        return financialMarketAnalysis;
    }

    public void setFinancialMarketAnalysisServiceType(String financialMarketAnalysisServiceType) {
        this.financialMarketAnalysisServiceType = financialMarketAnalysisServiceType;
    }

    public String getFinancialMarketAnalysisServiceType() {
        return financialMarketAnalysisServiceType;
    }

    public void setFinancialMarketAnalysisServiceDescription(String financialMarketAnalysisServiceDescription) {
        this.financialMarketAnalysisServiceDescription = financialMarketAnalysisServiceDescription;
    }

    public String getFinancialMarketAnalysisServiceDescription() {
        return financialMarketAnalysisServiceDescription;
    }

    public void setFinancialMarketAnalysisServiceInputsandOuputs(String financialMarketAnalysisServiceInputsandOuputs) {
        this.financialMarketAnalysisServiceInputsandOuputs = financialMarketAnalysisServiceInputsandOuputs;
    }

    public String getFinancialMarketAnalysisServiceInputsandOuputs() {
        return financialMarketAnalysisServiceInputsandOuputs;
    }

    public void setFinancialMarketAnalysisServiceWorkProduct(String financialMarketAnalysisServiceWorkProduct) {
        this.financialMarketAnalysisServiceWorkProduct = financialMarketAnalysisServiceWorkProduct;
    }

    public String getFinancialMarketAnalysisServiceWorkProduct() {
        return financialMarketAnalysisServiceWorkProduct;
    }

    public void setFinancialMarketAnalysisServiceName(String financialMarketAnalysisServiceName) {
        this.financialMarketAnalysisServiceName = financialMarketAnalysisServiceName;
    }

    public String getFinancialMarketAnalysisServiceName() {
        return financialMarketAnalysisServiceName;
    }
}