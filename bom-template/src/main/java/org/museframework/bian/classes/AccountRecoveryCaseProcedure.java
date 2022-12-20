/*A procedure for management and investigation of a customer account recovery case/dispute. */
package org.museframework.bian.classes;

public class AccountRecoveryCaseProcedure {
    /*Customer correspondence/feedback associated with the account recovery process.*/
    private String customerCommentary;

    public void setCustomerCommentary(String customerCommentary) {
        this.customerCommentary = customerCommentary;
    }

    public String getCustomerCommentary() {
        return customerCommentary;
    }
}