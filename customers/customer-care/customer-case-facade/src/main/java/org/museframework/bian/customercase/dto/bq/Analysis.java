/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.customercase.dto.bq;

public class Analysis extends org.museframework.bian.classes.Analysis {
    /*The contact record contains all details of the initial case submission*/
    private String customerContactRecord;

    /*Work documentation, forms and schedules produced and referenced during the analysis*/
    private String caseAnalysisWorkProduct;

    /*The outcome of the case root cause analysis*/
    private String caseAnalysisWorkTaskResult;

    public void setCustomerContactRecord(String customerContactRecord) {
        this.customerContactRecord = customerContactRecord;
    }

    public String getCustomerContactRecord() {
        return customerContactRecord;
    }

    public void setCaseAnalysisWorkProduct(String caseAnalysisWorkProduct) {
        this.caseAnalysisWorkProduct = caseAnalysisWorkProduct;
    }

    public String getCaseAnalysisWorkProduct() {
        return caseAnalysisWorkProduct;
    }

    public void setCaseAnalysisWorkTaskResult(String caseAnalysisWorkTaskResult) {
        this.caseAnalysisWorkTaskResult = caseAnalysisWorkTaskResult;
    }

    public String getCaseAnalysisWorkTaskResult() {
        return caseAnalysisWorkTaskResult;
    }
}