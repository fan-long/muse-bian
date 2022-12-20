package org.museframework.bian.cusproandser.dto;

public class RequestIn_forceServicepropertyRequest {
    private String customerproductsandservicesid;

    private String in_forceservicepropertyid;

    private org.museframework.bian.cusproandser.dto.bq.In_forceServiceproperty in_forceServiceproperty;

    public void setCustomerproductsandservicesid(String customerproductsandservicesid) {
        this.customerproductsandservicesid = customerproductsandservicesid;
    }

    public String getCustomerproductsandservicesid() {
        return customerproductsandservicesid;
    }

    public void setIn_forceservicepropertyid(String in_forceservicepropertyid) {
        this.in_forceservicepropertyid = in_forceservicepropertyid;
    }

    public String getIn_forceservicepropertyid() {
        return in_forceservicepropertyid;
    }

    public void setIn_forceServiceproperty(org.museframework.bian.cusproandser.dto.bq.In_forceServiceproperty in_forceServiceproperty) {
        this.in_forceServiceproperty = in_forceServiceproperty;
    }

    public org.museframework.bian.cusproandser.dto.bq.In_forceServiceproperty getIn_forceServiceproperty() {
        return in_forceServiceproperty;
    }
}