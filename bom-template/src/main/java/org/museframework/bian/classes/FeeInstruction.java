/*A financial instruction to fulfill a fee arrangement

Example:
- Instruction to calculate the fee
- Instruction to charge the calculated fee
- Instruction to book the calculated fee*/
package org.museframework.bian.classes;

public class FeeInstruction {
    /*Amount of money asked or paid for the charge (ISO20022)
*/
    private String feeAmount;

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getFeeAmount() {
        return feeAmount;
    }
}