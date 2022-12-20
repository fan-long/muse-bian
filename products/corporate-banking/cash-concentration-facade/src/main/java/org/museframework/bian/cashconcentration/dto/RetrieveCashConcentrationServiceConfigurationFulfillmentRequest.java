package org.museframework.bian.cashconcentration.dto;

public class RetrieveCashConcentrationServiceConfigurationFulfillmentRequest {
    private String cashconcentrationid;

    private String cashconcentrationserviceconfigurationfulfillmentid;

    public void setCashconcentrationid(String cashconcentrationid) {
        this.cashconcentrationid = cashconcentrationid;
    }

    public String getCashconcentrationid() {
        return cashconcentrationid;
    }

    public void setCashconcentrationserviceconfigurationfulfillmentid(String cashconcentrationserviceconfigurationfulfillmentid) {
        this.cashconcentrationserviceconfigurationfulfillmentid = cashconcentrationserviceconfigurationfulfillmentid;
    }

    public String getCashconcentrationserviceconfigurationfulfillmentid() {
        return cashconcentrationserviceconfigurationfulfillmentid;
    }
}