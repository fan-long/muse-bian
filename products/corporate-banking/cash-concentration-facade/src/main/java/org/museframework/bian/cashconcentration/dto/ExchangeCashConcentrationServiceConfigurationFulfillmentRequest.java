package org.museframework.bian.cashconcentration.dto;

public class ExchangeCashConcentrationServiceConfigurationFulfillmentRequest {
    private String cashconcentrationid;

    private String cashconcentrationserviceconfigurationfulfillmentid;

    private org.museframework.bian.cashconcentration.dto.bq.CashConcentrationServiceConfigurationFulfillment cashConcentrationServiceConfigurationFulfillment;

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

    public void setCashConcentrationServiceConfigurationFulfillment(org.museframework.bian.cashconcentration.dto.bq.CashConcentrationServiceConfigurationFulfillment cashConcentrationServiceConfigurationFulfillment) {
        this.cashConcentrationServiceConfigurationFulfillment = cashConcentrationServiceConfigurationFulfillment;
    }

    public org.museframework.bian.cashconcentration.dto.bq.CashConcentrationServiceConfigurationFulfillment getCashConcentrationServiceConfigurationFulfillment() {
        return cashConcentrationServiceConfigurationFulfillment;
    }
}