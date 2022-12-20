/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.sessiondialogue.dto.bq;

public class Case extends org.museframework.bian.classes.Case {
    /*Reference to a specific product instance provided by the customer*/
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The type of case being processed including any supporting narrative (e.g. disputed charges, suspected account fraud, stolen device, change of status)*/
    private String customerCaseType;

    /*The result of the invocation (e.g. case active)*/
    private String caseTaskResult;

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setCustomerCaseType(String customerCaseType) {
        this.customerCaseType = customerCaseType;
    }

    public String getCustomerCaseType() {
        return customerCaseType;
    }

    public void setCaseTaskResult(String caseTaskResult) {
        this.caseTaskResult = caseTaskResult;
    }

    public String getCaseTaskResult() {
        return caseTaskResult;
    }
}