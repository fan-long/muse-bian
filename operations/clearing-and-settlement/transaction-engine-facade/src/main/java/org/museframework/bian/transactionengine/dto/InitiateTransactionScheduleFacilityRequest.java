package org.museframework.bian.transactionengine.dto;

public class InitiateTransactionScheduleFacilityRequest {
    private org.museframework.bian.transactionengine.dto.cr.TransactionScheduleFacility transactionScheduleFacility;

    public void setTransactionScheduleFacility(org.museframework.bian.transactionengine.dto.cr.TransactionScheduleFacility transactionScheduleFacility) {
        this.transactionScheduleFacility = transactionScheduleFacility;
    }

    public org.museframework.bian.transactionengine.dto.cr.TransactionScheduleFacility getTransactionScheduleFacility() {
        return transactionScheduleFacility;
    }
}