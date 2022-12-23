/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Open Item Management. */
package org.museframework.bian.opeiteman.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class OpenItemProcedure extends org.museframework.bian.classes.OpenItemProcedure {
    /*The type of open item, typically an overdue payment*/
    @MetaField
    private String openItemType;

    /*Specific detail of the open item for reference*/
    @MetaField
    private String openItemDescription;

    /*Reference to the associated loan account*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*Reference to the customer/party responsible*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object partyReference;

    /*Payment schedule used for staged payments*/
    @MetaField
    private String loanRepaymentSchedule;

    /*The outstanding balance*/
    @MetaField
    private String loanOutstandingBalance;

    /*The date the loan agreement is terminated*/
    @MetaField
    private String loanTerminationDate;

    /*A statement of repayment transactions made against the item*/
    @MetaField
    private String repaymentStatement;

    public void setOpenItemType(String openItemType) {
        this.openItemType = openItemType;
    }

    public String getOpenItemType() {
        return openItemType;
    }

    public void setOpenItemDescription(String openItemDescription) {
        this.openItemDescription = openItemDescription;
    }

    public String getOpenItemDescription() {
        return openItemDescription;
    }

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setPartyReference(org.museframework.bian.classes.Object partyReference) {
        this.partyReference = partyReference;
    }

    public org.museframework.bian.classes.Object getPartyReference() {
        return partyReference;
    }

    public void setLoanRepaymentSchedule(String loanRepaymentSchedule) {
        this.loanRepaymentSchedule = loanRepaymentSchedule;
    }

    public String getLoanRepaymentSchedule() {
        return loanRepaymentSchedule;
    }

    public void setLoanOutstandingBalance(String loanOutstandingBalance) {
        this.loanOutstandingBalance = loanOutstandingBalance;
    }

    public String getLoanOutstandingBalance() {
        return loanOutstandingBalance;
    }

    public void setLoanTerminationDate(String loanTerminationDate) {
        this.loanTerminationDate = loanTerminationDate;
    }

    public String getLoanTerminationDate() {
        return loanTerminationDate;
    }

    public void setRepaymentStatement(String repaymentStatement) {
        this.repaymentStatement = repaymentStatement;
    }

    public String getRepaymentStatement() {
        return repaymentStatement;
    }
}