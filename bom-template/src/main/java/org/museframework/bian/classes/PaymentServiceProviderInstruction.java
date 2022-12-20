/*Money Transfer instruction given to a Payment Service Provider*/
package org.museframework.bian.classes;

public class PaymentServiceProviderInstruction {
    /*The network activated for the processing of the payment instruction.*/
    private String moneyTransferInstructionUsedMechanism;

    /*The amount of the original instruction.

*/
    private String moneyTransferInstructionOriginalAmount;

    /*The currency the amount of the original instruction as expressed in.*/
    private String moneyTransferInstructionOriginalCurrency;

    /*Reference to the instruction that was the start of the service provider chain.*/
    private String originalMoneyTransferInstructionReference;

    public void setMoneyTransferInstructionUsedMechanism(String moneyTransferInstructionUsedMechanism) {
        this.moneyTransferInstructionUsedMechanism = moneyTransferInstructionUsedMechanism;
    }

    public String getMoneyTransferInstructionUsedMechanism() {
        return moneyTransferInstructionUsedMechanism;
    }

    public void setMoneyTransferInstructionOriginalAmount(String moneyTransferInstructionOriginalAmount) {
        this.moneyTransferInstructionOriginalAmount = moneyTransferInstructionOriginalAmount;
    }

    public String getMoneyTransferInstructionOriginalAmount() {
        return moneyTransferInstructionOriginalAmount;
    }

    public void setMoneyTransferInstructionOriginalCurrency(String moneyTransferInstructionOriginalCurrency) {
        this.moneyTransferInstructionOriginalCurrency = moneyTransferInstructionOriginalCurrency;
    }

    public String getMoneyTransferInstructionOriginalCurrency() {
        return moneyTransferInstructionOriginalCurrency;
    }

    public void setOriginalMoneyTransferInstructionReference(String originalMoneyTransferInstructionReference) {
        this.originalMoneyTransferInstructionReference = originalMoneyTransferInstructionReference;
    }

    public String getOriginalMoneyTransferInstructionReference() {
        return originalMoneyTransferInstructionReference;
    }
}