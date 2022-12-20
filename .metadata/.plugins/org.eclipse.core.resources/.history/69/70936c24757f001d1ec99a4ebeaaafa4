/*Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. (ISO20022)*/
package org.museframework.bian.classes;

public class PaymentInstruction {
    /*A classification of an instance of a payment instruction as an inbound or outbound payment.*/
    private String paymentInstructionDirectionType;

    /*Classification of a payment instruction according to the arrangement type that made it possible/generated it

There are several ways a payment instruction can be created
- as a consequence of the fulfillment of an arrangement ("a "xxx-FulfillmentEvent" (a standing order instruction is also the fulfillment of an arrangement)
- as an instruction given by a customer (made possible by a payment service arrangement), e.g. a credit transfer, a card payment, a withdrawal, a deposit, a direct debit instruction.*/
    private org.museframework.bian.enumerations.Paymentinstructiontypevalues paymentInstructionType;

    /*The payment system requested to be used in a payment instruction.*/
    private String paymentInstructionRequestedMechanism;

    /*Type of critical dates of a payment transaction executed by the payment order like RequestedExecutionDate.*/
    private String paymentInstructionDateTime;

    /*Date and time range within which the payment instruction must be processed. ISO20022*/
    private String paymentInstructionProcessingValidityTime;

    /*Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction. ISO20022*/
    private org.museframework.bian.enumerations.Priorityvaluetypes paymentInstructionPriority;

    /*Specifies the clearing channel to be used to process the payment instruction. ISO20022*/
    private org.museframework.bian.enumerations.Clearingchanneltypevalues paymentInstructionClearingChannel;

    public void setPaymentInstructionDirectionType(String paymentInstructionDirectionType) {
        this.paymentInstructionDirectionType = paymentInstructionDirectionType;
    }

    public String getPaymentInstructionDirectionType() {
        return paymentInstructionDirectionType;
    }

    public void setPaymentInstructionType(org.museframework.bian.enumerations.Paymentinstructiontypevalues paymentInstructionType) {
        this.paymentInstructionType = paymentInstructionType;
    }

    public org.museframework.bian.enumerations.Paymentinstructiontypevalues getPaymentInstructionType() {
        return paymentInstructionType;
    }

    public void setPaymentInstructionRequestedMechanism(String paymentInstructionRequestedMechanism) {
        this.paymentInstructionRequestedMechanism = paymentInstructionRequestedMechanism;
    }

    public String getPaymentInstructionRequestedMechanism() {
        return paymentInstructionRequestedMechanism;
    }

    public void setPaymentInstructionDateTime(String paymentInstructionDateTime) {
        this.paymentInstructionDateTime = paymentInstructionDateTime;
    }

    public String getPaymentInstructionDateTime() {
        return paymentInstructionDateTime;
    }

    public void setPaymentInstructionProcessingValidityTime(String paymentInstructionProcessingValidityTime) {
        this.paymentInstructionProcessingValidityTime = paymentInstructionProcessingValidityTime;
    }

    public String getPaymentInstructionProcessingValidityTime() {
        return paymentInstructionProcessingValidityTime;
    }

    public void setPaymentInstructionPriority(org.museframework.bian.enumerations.Priorityvaluetypes paymentInstructionPriority) {
        this.paymentInstructionPriority = paymentInstructionPriority;
    }

    public org.museframework.bian.enumerations.Priorityvaluetypes getPaymentInstructionPriority() {
        return paymentInstructionPriority;
    }

    public void setPaymentInstructionClearingChannel(org.museframework.bian.enumerations.Clearingchanneltypevalues paymentInstructionClearingChannel) {
        this.paymentInstructionClearingChannel = paymentInstructionClearingChannel;
    }

    public org.museframework.bian.enumerations.Clearingchanneltypevalues getPaymentInstructionClearingChannel() {
        return paymentInstructionClearingChannel;
    }
}