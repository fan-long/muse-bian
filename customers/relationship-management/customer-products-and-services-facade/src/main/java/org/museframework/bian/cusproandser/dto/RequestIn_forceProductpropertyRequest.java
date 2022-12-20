package org.museframework.bian.cusproandser.dto;

public class RequestIn_forceProductpropertyRequest {
    private String customerproductsandservicesid;

    private String in_forceproductpropertyid;

    private org.museframework.bian.cusproandser.dto.bq.In_forceProductproperty in_forceProductproperty;

    public void setCustomerproductsandservicesid(String customerproductsandservicesid) {
        this.customerproductsandservicesid = customerproductsandservicesid;
    }

    public String getCustomerproductsandservicesid() {
        return customerproductsandservicesid;
    }

    public void setIn_forceproductpropertyid(String in_forceproductpropertyid) {
        this.in_forceproductpropertyid = in_forceproductpropertyid;
    }

    public String getIn_forceproductpropertyid() {
        return in_forceproductpropertyid;
    }

    public void setIn_forceProductproperty(org.museframework.bian.cusproandser.dto.bq.In_forceProductproperty in_forceProductproperty) {
        this.in_forceProductproperty = in_forceProductproperty;
    }

    public org.museframework.bian.cusproandser.dto.bq.In_forceProductproperty getIn_forceProductproperty() {
        return in_forceProductproperty;
    }
}