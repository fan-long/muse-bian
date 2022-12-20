/*An interpretation/observation on the customer's behaviour. */
package org.museframework.bian.classes;

public class CustomerInsight {
    /**/
    private String customerInsightType;

    /**/
    private String customerInsightAlgorithm;

    /**/
    private String customerInsightValue;

    /**/
    private String customerInsightCalculationDate;

    /**/
    private String customerInsightDescription;

    public void setCustomerInsightType(String customerInsightType) {
        this.customerInsightType = customerInsightType;
    }

    public String getCustomerInsightType() {
        return customerInsightType;
    }

    public void setCustomerInsightAlgorithm(String customerInsightAlgorithm) {
        this.customerInsightAlgorithm = customerInsightAlgorithm;
    }

    public String getCustomerInsightAlgorithm() {
        return customerInsightAlgorithm;
    }

    public void setCustomerInsightValue(String customerInsightValue) {
        this.customerInsightValue = customerInsightValue;
    }

    public String getCustomerInsightValue() {
        return customerInsightValue;
    }

    public void setCustomerInsightCalculationDate(String customerInsightCalculationDate) {
        this.customerInsightCalculationDate = customerInsightCalculationDate;
    }

    public String getCustomerInsightCalculationDate() {
        return customerInsightCalculationDate;
    }

    public void setCustomerInsightDescription(String customerInsightDescription) {
        this.customerInsightDescription = customerInsightDescription;
    }

    public String getCustomerInsightDescription() {
        return customerInsightDescription;
    }
}