/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardclearing.dto.bq;

public class Fees {
    /*Defines intercharge rates and fees to be applied to card transactions*/
    private String interchargeFees;

    /*Details of the transaction fee processing*/
    private String feeTaskResult;

    public void setInterchargeFees(String interchargeFees) {
        this.interchargeFees = interchargeFees;
    }

    public String getInterchargeFees() {
        return interchargeFees;
    }

    public void setFeeTaskResult(String feeTaskResult) {
        this.feeTaskResult = feeTaskResult;
    }

    public String getFeeTaskResult() {
        return feeTaskResult;
    }
}