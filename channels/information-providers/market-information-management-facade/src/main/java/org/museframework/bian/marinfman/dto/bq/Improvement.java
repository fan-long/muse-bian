/*A collection of one or more clerical routines that are to be followed to administer the operational unit/function

Examples: Time-sheet recording*/
package org.museframework.bian.marinfman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Improvement {
    /*Defines the type of technique used to improve the content (e.g. cross verification, pattern/anomaly detection)*/
    @MetaField
    private String financialMarketInformationImprovementTaskType;

    /*References to the different sources of financial market information used to improve the content (can be primary source and comparison data)*/
    @MetaField
    private String financialMarketInformationImprovementTaskSources;

    /*Work documentation, forms and schedules produced and referenced during the enquiry*/
    @MetaField
    private String financialMarketInformationImprovementTaskWorkProducts;

    /*Output of the improvement task that is recorded back to the Financial Market Information Database*/
    @MetaField
    private String financialMarketInformationImprovementTaskResult;

    public void setFinancialMarketInformationImprovementTaskType(String financialMarketInformationImprovementTaskType) {
        this.financialMarketInformationImprovementTaskType = financialMarketInformationImprovementTaskType;
    }

    public String getFinancialMarketInformationImprovementTaskType() {
        return financialMarketInformationImprovementTaskType;
    }

    public void setFinancialMarketInformationImprovementTaskSources(String financialMarketInformationImprovementTaskSources) {
        this.financialMarketInformationImprovementTaskSources = financialMarketInformationImprovementTaskSources;
    }

    public String getFinancialMarketInformationImprovementTaskSources() {
        return financialMarketInformationImprovementTaskSources;
    }

    public void setFinancialMarketInformationImprovementTaskWorkProducts(String financialMarketInformationImprovementTaskWorkProducts) {
        this.financialMarketInformationImprovementTaskWorkProducts = financialMarketInformationImprovementTaskWorkProducts;
    }

    public String getFinancialMarketInformationImprovementTaskWorkProducts() {
        return financialMarketInformationImprovementTaskWorkProducts;
    }

    public void setFinancialMarketInformationImprovementTaskResult(String financialMarketInformationImprovementTaskResult) {
        this.financialMarketInformationImprovementTaskResult = financialMarketInformationImprovementTaskResult;
    }

    public String getFinancialMarketInformationImprovementTaskResult() {
        return financialMarketInformationImprovementTaskResult;
    }
}