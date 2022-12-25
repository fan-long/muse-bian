/*The configuration and execution of Project Finance SPV Fulfillment arrangement within the Project Finance SPV Fulfillment*/
package org.museframework.bian.projectfinance.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProjectFinanceRepaymentFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String schedule;

    /*The Project Finance Repayment Fulfillment specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Project Finance Repayment Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility projectFinanceFacilityReference;

    /*Reference to Project Finance Repayment Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object projectFinanceRepaymentFulfillmentReference;

    /*The type of Project Finance Repayment Fulfillment*/
    @MetaField(0)
    private String projectFinanceRepaymentFulfillmentType;

    /*An unique reference to an item or an occurance (data type is Object)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object reaymentFulfillmentInstanceReference;

    /*The type of repayment (e.g. scheduled repayment, balloon/early termination)*/
    @MetaField(0)
    private String repaymentTransactionType;

    /*Reference to the payer*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object repaymentTransactionPayerReference;

    /*Reference to the account where the payment is made from*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object repaymentTransactionPayerProductInstanceReference;

    /*Reference to the payer's bank*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object repaymentTransactionPayerBankReference;

    /*The amount of the repayment*/
    @MetaField(0)
    private String repaymentTransactionAmount;

    /*The currency used for the repayment*/
    @MetaField(0)
    private String repaymentTransactionCurrency;

    /*The value date for the repayment transaction*/
    @MetaField(0)
    private String repaymentTransactionValueDate;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setPostconditions(org.museframework.bian.classes.Condition postconditions) {
        this.postconditions = postconditions;
    }

    public org.museframework.bian.classes.Condition getPostconditions() {
        return postconditions;
    }

    public void setProjectFinanceFacilityReference(org.museframework.bian.classes.FinancialFacility projectFinanceFacilityReference) {
        this.projectFinanceFacilityReference = projectFinanceFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getProjectFinanceFacilityReference() {
        return projectFinanceFacilityReference;
    }

    public void setProjectFinanceRepaymentFulfillmentReference(org.museframework.bian.classes.Object projectFinanceRepaymentFulfillmentReference) {
        this.projectFinanceRepaymentFulfillmentReference = projectFinanceRepaymentFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getProjectFinanceRepaymentFulfillmentReference() {
        return projectFinanceRepaymentFulfillmentReference;
    }

    public void setProjectFinanceRepaymentFulfillmentType(String projectFinanceRepaymentFulfillmentType) {
        this.projectFinanceRepaymentFulfillmentType = projectFinanceRepaymentFulfillmentType;
    }

    public String getProjectFinanceRepaymentFulfillmentType() {
        return projectFinanceRepaymentFulfillmentType;
    }

    public void setReaymentFulfillmentInstanceReference(org.museframework.bian.classes.Object reaymentFulfillmentInstanceReference) {
        this.reaymentFulfillmentInstanceReference = reaymentFulfillmentInstanceReference;
    }

    public org.museframework.bian.classes.Object getReaymentFulfillmentInstanceReference() {
        return reaymentFulfillmentInstanceReference;
    }

    public void setRepaymentTransactionType(String repaymentTransactionType) {
        this.repaymentTransactionType = repaymentTransactionType;
    }

    public String getRepaymentTransactionType() {
        return repaymentTransactionType;
    }

    public void setRepaymentTransactionPayerReference(org.museframework.bian.classes.Object repaymentTransactionPayerReference) {
        this.repaymentTransactionPayerReference = repaymentTransactionPayerReference;
    }

    public org.museframework.bian.classes.Object getRepaymentTransactionPayerReference() {
        return repaymentTransactionPayerReference;
    }

    public void setRepaymentTransactionPayerProductInstanceReference(org.museframework.bian.classes.Object repaymentTransactionPayerProductInstanceReference) {
        this.repaymentTransactionPayerProductInstanceReference = repaymentTransactionPayerProductInstanceReference;
    }

    public org.museframework.bian.classes.Object getRepaymentTransactionPayerProductInstanceReference() {
        return repaymentTransactionPayerProductInstanceReference;
    }

    public void setRepaymentTransactionPayerBankReference(org.museframework.bian.classes.Object repaymentTransactionPayerBankReference) {
        this.repaymentTransactionPayerBankReference = repaymentTransactionPayerBankReference;
    }

    public org.museframework.bian.classes.Object getRepaymentTransactionPayerBankReference() {
        return repaymentTransactionPayerBankReference;
    }

    public void setRepaymentTransactionAmount(String repaymentTransactionAmount) {
        this.repaymentTransactionAmount = repaymentTransactionAmount;
    }

    public String getRepaymentTransactionAmount() {
        return repaymentTransactionAmount;
    }

    public void setRepaymentTransactionCurrency(String repaymentTransactionCurrency) {
        this.repaymentTransactionCurrency = repaymentTransactionCurrency;
    }

    public String getRepaymentTransactionCurrency() {
        return repaymentTransactionCurrency;
    }

    public void setRepaymentTransactionValueDate(String repaymentTransactionValueDate) {
        this.repaymentTransactionValueDate = repaymentTransactionValueDate;
    }

    public String getRepaymentTransactionValueDate() {
        return repaymentTransactionValueDate;
    }
}