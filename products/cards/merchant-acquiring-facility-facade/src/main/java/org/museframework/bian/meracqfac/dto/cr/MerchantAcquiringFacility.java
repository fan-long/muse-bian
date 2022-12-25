/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Merchant Acquiring Facility. */
package org.museframework.bian.meracqfac.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MerchantAcquiringFacility {
    /*Reference to the merchant facility product instance*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*Reference to the merchant primary party/owner*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to the legal entity (typically the customer)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object partyReference;

    /*Bank branch associated with the merchant account for booking purposes*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object bankBranchLocationReference;

    /*The billing currency for the merchant acquiring facility account*/
    @MetaField(0)
    private String accountCurrency;

    /*Reference identifier linking the account to appropriate tax handling*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object taxReference;

    /*Operational terms governing the merchant facility*/
    @MetaField(0)
    private String merchantAcquiringFacilityOperationalTerms;

    /*Merchant acquiring facility limits (e.g. spend limits and credit limits for the merchant facility)*/
    @MetaField(0)
    private String merchantAcquiringFacilityPositionLimits;

    /*The type of position maintained for the account (e.g. transaction credit/debit, netting, position)*/
    @MetaField(0)
    private String merchantPositionLimitType;

    /*The position definition, associated limit settings and rules*/
    @MetaField(0)
    private String merchantPositionLimitSettings;

    /*The savings calculated position*/
    @MetaField(0)
    private String merchantPositionLimitValue;

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setPartyReference(org.museframework.bian.classes.Object partyReference) {
        this.partyReference = partyReference;
    }

    public org.museframework.bian.classes.Object getPartyReference() {
        return partyReference;
    }

    public void setBankBranchLocationReference(org.museframework.bian.classes.Object bankBranchLocationReference) {
        this.bankBranchLocationReference = bankBranchLocationReference;
    }

    public org.museframework.bian.classes.Object getBankBranchLocationReference() {
        return bankBranchLocationReference;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setTaxReference(org.museframework.bian.classes.Object taxReference) {
        this.taxReference = taxReference;
    }

    public org.museframework.bian.classes.Object getTaxReference() {
        return taxReference;
    }

    public void setMerchantAcquiringFacilityOperationalTerms(String merchantAcquiringFacilityOperationalTerms) {
        this.merchantAcquiringFacilityOperationalTerms = merchantAcquiringFacilityOperationalTerms;
    }

    public String getMerchantAcquiringFacilityOperationalTerms() {
        return merchantAcquiringFacilityOperationalTerms;
    }

    public void setMerchantAcquiringFacilityPositionLimits(String merchantAcquiringFacilityPositionLimits) {
        this.merchantAcquiringFacilityPositionLimits = merchantAcquiringFacilityPositionLimits;
    }

    public String getMerchantAcquiringFacilityPositionLimits() {
        return merchantAcquiringFacilityPositionLimits;
    }

    public void setMerchantPositionLimitType(String merchantPositionLimitType) {
        this.merchantPositionLimitType = merchantPositionLimitType;
    }

    public String getMerchantPositionLimitType() {
        return merchantPositionLimitType;
    }

    public void setMerchantPositionLimitSettings(String merchantPositionLimitSettings) {
        this.merchantPositionLimitSettings = merchantPositionLimitSettings;
    }

    public String getMerchantPositionLimitSettings() {
        return merchantPositionLimitSettings;
    }

    public void setMerchantPositionLimitValue(String merchantPositionLimitValue) {
        this.merchantPositionLimitValue = merchantPositionLimitValue;
    }

    public String getMerchantPositionLimitValue() {
        return merchantPositionLimitValue;
    }
}