/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Accounts Receivable. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.accountsreceivable.dto.bq;

public class AccountsReceivableOutcome {
    /**/
    private String accountsReceivableWorkProduct;

    /**/
    private String accountsReceivableProcedure;

    public void setAccountsReceivableWorkProduct(String accountsReceivableWorkProduct) {
        this.accountsReceivableWorkProduct = accountsReceivableWorkProduct;
    }

    public String getAccountsReceivableWorkProduct() {
        return accountsReceivableWorkProduct;
    }

    public void setAccountsReceivableProcedure(String accountsReceivableProcedure) {
        this.accountsReceivableProcedure = accountsReceivableProcedure;
    }

    public String getAccountsReceivableProcedure() {
        return accountsReceivableProcedure;
    }
}