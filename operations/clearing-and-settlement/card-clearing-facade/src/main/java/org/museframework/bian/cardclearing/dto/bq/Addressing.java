/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardclearing.dto.bq;

public class Addressing {
    /*Details of the transaction addressing*/
    private String addressingTaskResult;

    public void setAddressingTaskResult(String addressingTaskResult) {
        this.addressingTaskResult = addressingTaskResult;
    }

    public String getAddressingTaskResult() {
        return addressingTaskResult;
    }
}