/*A specific role which is played by a specific party in the merchant agreement. */
package org.museframework.bian.classes;

public class MerchantAgreementInvolvement {
    /**/
    private String merchantAgreementInvolvementType;

    public void setMerchantAgreementInvolvementType(String merchantAgreementInvolvementType) {
        this.merchantAgreementInvolvementType = merchantAgreementInvolvementType;
    }

    public String getMerchantAgreementInvolvementType() {
        return merchantAgreementInvolvementType;
    }
}