/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing within Disbursement. */
package org.museframework.bian.disbursement.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class DisbursementTransaction extends org.museframework.bian.classes.DisbursementTransaction {
    /*Reference to the loan account for which the disbursement is made*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*Reference to the authorizing employee*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object authorizingEmployeeReference;

    /*Reference to the customer owning the loan, used to obtain payment arrangements*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to the internal funding account for the disbursement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object fundingAccountReference;

    /*Reference to the target for the disbursement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object payeeReference;

    /*Reference to the account to where the disbursement payment is made*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object payeeProductInstanceReference;

    /*Reference to the payee account bank*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object payeeBankReference;

    /*The amount of the disbursement*/
    @MetaField
    private String amount;

    /*The currency for the payment*/
    @MetaField
    private String currency;

    /*The value date for the disbursement payment*/
    @MetaField
    private String valueDate;

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setAuthorizingEmployeeReference(org.museframework.bian.classes.Object authorizingEmployeeReference) {
        this.authorizingEmployeeReference = authorizingEmployeeReference;
    }

    public org.museframework.bian.classes.Object getAuthorizingEmployeeReference() {
        return authorizingEmployeeReference;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setFundingAccountReference(org.museframework.bian.classes.Object fundingAccountReference) {
        this.fundingAccountReference = fundingAccountReference;
    }

    public org.museframework.bian.classes.Object getFundingAccountReference() {
        return fundingAccountReference;
    }

    public void setPayeeReference(org.museframework.bian.classes.Object payeeReference) {
        this.payeeReference = payeeReference;
    }

    public org.museframework.bian.classes.Object getPayeeReference() {
        return payeeReference;
    }

    public void setPayeeProductInstanceReference(org.museframework.bian.classes.Object payeeProductInstanceReference) {
        this.payeeProductInstanceReference = payeeProductInstanceReference;
    }

    public org.museframework.bian.classes.Object getPayeeProductInstanceReference() {
        return payeeProductInstanceReference;
    }

    public void setPayeeBankReference(org.museframework.bian.classes.Object payeeBankReference) {
        this.payeeBankReference = payeeBankReference;
    }

    public org.museframework.bian.classes.Object getPayeeBankReference() {
        return payeeBankReference;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public String getValueDate() {
        return valueDate;
    }
}