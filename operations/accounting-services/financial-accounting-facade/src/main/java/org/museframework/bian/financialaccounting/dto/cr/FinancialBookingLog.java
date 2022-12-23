/*Maintain a log of transactions or activity, typically a financial account/journal or a log of activity to support behavioral analysis within Financial Accounting. */
package org.museframework.bian.financialaccounting.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FinancialBookingLog {
    /*The type of accounting facility (e.g. journal, sub-ledger)*/
    @MetaField
    private String financialAccountType;

    /*Reference to the associated product or service for which this is the underlying accounting*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productandServiceReference;

    /*Reference to the owning business unit and associated business activity*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object businessUnitReference;

    /*Reference to applicable account booking rules*/
    @MetaField
    private String chartofAccountBookingRules;

    /*The currency for the postings*/
    @MetaField
    private String baseCurrency;

    /*Status of the financial log (e.g. active, in-suspense)*/
    @MetaField
    private String status;

    public void setFinancialAccountType(String financialAccountType) {
        this.financialAccountType = financialAccountType;
    }

    public String getFinancialAccountType() {
        return financialAccountType;
    }

    public void setProductandServiceReference(org.museframework.bian.classes.Object productandServiceReference) {
        this.productandServiceReference = productandServiceReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceReference() {
        return productandServiceReference;
    }

    public void setBusinessUnitReference(org.museframework.bian.classes.Object businessUnitReference) {
        this.businessUnitReference = businessUnitReference;
    }

    public org.museframework.bian.classes.Object getBusinessUnitReference() {
        return businessUnitReference;
    }

    public void setChartofAccountBookingRules(String chartofAccountBookingRules) {
        this.chartofAccountBookingRules = chartofAccountBookingRules;
    }

    public String getChartofAccountBookingRules() {
        return chartofAccountBookingRules;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}