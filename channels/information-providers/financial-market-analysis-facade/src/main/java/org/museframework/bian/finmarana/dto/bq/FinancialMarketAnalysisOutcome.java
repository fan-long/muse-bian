/*Analyze the performance or behavior of some on-going activity or entity  within Financial Market Analysis. 
Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.

Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.*/
package org.museframework.bian.finmarana.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FinancialMarketAnalysisOutcome {
    /**/
    @MetaField(0)
    private String financialMarketAnalysisWorkProduct;

    /**/
    @MetaField(0)
    private String financialMarketAnalysisAnalysisType;

    public void setFinancialMarketAnalysisWorkProduct(String financialMarketAnalysisWorkProduct) {
        this.financialMarketAnalysisWorkProduct = financialMarketAnalysisWorkProduct;
    }

    public String getFinancialMarketAnalysisWorkProduct() {
        return financialMarketAnalysisWorkProduct;
    }

    public void setFinancialMarketAnalysisAnalysisType(String financialMarketAnalysisAnalysisType) {
        this.financialMarketAnalysisAnalysisType = financialMarketAnalysisAnalysisType;
    }

    public String getFinancialMarketAnalysisAnalysisType() {
        return financialMarketAnalysisAnalysisType;
    }
}