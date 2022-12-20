/*The involved parties in transaction are actually the involved parties that are involved in the process of delivering the service that is requested for (via an instruction) as to fulfil an arranged service within an agreement.*/
package org.museframework.bian.classes;

public class TransactionInvolvement {
    /**/
    private org.museframework.bian.enumerations.Transactioninvolvementtypevalues transactionInvolvementType;

    /**/
    private Transaction transactionReference;

    /**/
    private Party partyReference;

    public void setTransactionInvolvementType(org.museframework.bian.enumerations.Transactioninvolvementtypevalues transactionInvolvementType) {
        this.transactionInvolvementType = transactionInvolvementType;
    }

    public org.museframework.bian.enumerations.Transactioninvolvementtypevalues getTransactionInvolvementType() {
        return transactionInvolvementType;
    }

    public void setTransactionReference(Transaction transactionReference) {
        this.transactionReference = transactionReference;
    }

    public Transaction getTransactionReference() {
        return transactionReference;
    }

    public void setPartyReference(Party partyReference) {
        this.partyReference = partyReference;
    }

    public Party getPartyReference() {
        return partyReference;
    }
}