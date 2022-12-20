/*Party performing the card payment transaction. (ISO20022)*/
package org.museframework.bian.classes;

public class Merchant {
    /**/
    private String merchantType;

    /**/
    private String merchantAddress;

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType;
    }

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress;
    }

    public String getMerchantAddress() {
        return merchantAddress;
    }
}