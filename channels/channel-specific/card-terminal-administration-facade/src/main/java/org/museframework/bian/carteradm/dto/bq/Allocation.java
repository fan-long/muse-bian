/*Set of rules for the purpose of deciding if or if not something is applicable

Examples: Staff assignment, Facility allocation.*/
package org.museframework.bian.carteradm.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Allocation extends org.museframework.bian.classes.Allocation {
    /*Reference to the Card merchant registered with the device*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object merchantReference;

    /*The type of merchant (e.g. retailer, hotel)*/
    @MetaField
    private String merchantType;

    /*The physical location/address of the retailer and the device*/
    @MetaField
    private String merchantLocation;

    /*The configuration defines its operational characteristics/capabilities e.g. (PIN pad, transaction capture, tip handling, transaction descriptive, manual entry, security keys, balancing, receipt options/text, communication options, card types, currencies, etc.)*/
    @MetaField
    private String cardPOSDeviceConfiguration;

    public void setMerchantReference(org.museframework.bian.classes.Object merchantReference) {
        this.merchantReference = merchantReference;
    }

    public org.museframework.bian.classes.Object getMerchantReference() {
        return merchantReference;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType;
    }

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantLocation(String merchantLocation) {
        this.merchantLocation = merchantLocation;
    }

    public String getMerchantLocation() {
        return merchantLocation;
    }

    public void setCardPOSDeviceConfiguration(String cardPOSDeviceConfiguration) {
        this.cardPOSDeviceConfiguration = cardPOSDeviceConfiguration;
    }

    public String getCardPOSDeviceConfiguration() {
        return cardPOSDeviceConfiguration;
    }
}