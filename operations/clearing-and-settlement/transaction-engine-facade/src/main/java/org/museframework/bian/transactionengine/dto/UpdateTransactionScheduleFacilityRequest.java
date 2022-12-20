package org.museframework.bian.transactionengine.dto;

public class UpdateTransactionScheduleFacilityRequest {
    private String transactionengineid;

    private org.museframework.bian.transactionengine.dto.cr.TransactionScheduleFacility transactionScheduleFacility;

    public void setTransactionengineid(String transactionengineid) {
        this.transactionengineid = transactionengineid;
    }

    public String getTransactionengineid() {
        return transactionengineid;
    }

    public void setTransactionScheduleFacility(org.museframework.bian.transactionengine.dto.cr.TransactionScheduleFacility transactionScheduleFacility) {
        this.transactionScheduleFacility = transactionScheduleFacility;
    }

    public org.museframework.bian.transactionengine.dto.cr.TransactionScheduleFacility getTransactionScheduleFacility() {
        return transactionScheduleFacility;
    }
}