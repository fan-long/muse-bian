package org.museframework.bian.bralocman.dto;

public class InitiateCustomerLiaisonResponse {
    private org.museframework.bian.bralocman.dto.bq.CustomerLiaison customerLiaison;

    public void setCustomerLiaison(org.museframework.bian.bralocman.dto.bq.CustomerLiaison customerLiaison) {
        this.customerLiaison = customerLiaison;
    }

    public org.museframework.bian.bralocman.dto.bq.CustomerLiaison getCustomerLiaison() {
        return customerLiaison;
    }
}