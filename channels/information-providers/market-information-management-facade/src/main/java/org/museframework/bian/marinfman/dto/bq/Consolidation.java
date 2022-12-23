/*A collection of one or more clerical routines that are to be followed to administer the operational unit/function

Examples: Time-sheet recording*/
package org.museframework.bian.marinfman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Consolidation {
    /*Refers to the content record provided by the external service provider in whatever form suitable*/
    @MetaField
    private String financialMarketInformationServiceReport;

    /*Key properties of the report used in its improvement (e.g. date created, qualifications of integrity)*/
    @MetaField
    private String financialMarketInformationServiceReportProperties;

    public void setFinancialMarketInformationServiceReport(String financialMarketInformationServiceReport) {
        this.financialMarketInformationServiceReport = financialMarketInformationServiceReport;
    }

    public String getFinancialMarketInformationServiceReport() {
        return financialMarketInformationServiceReport;
    }

    public void setFinancialMarketInformationServiceReportProperties(String financialMarketInformationServiceReportProperties) {
        this.financialMarketInformationServiceReportProperties = financialMarketInformationServiceReportProperties;
    }

    public String getFinancialMarketInformationServiceReportProperties() {
        return financialMarketInformationServiceReportProperties;
    }
}