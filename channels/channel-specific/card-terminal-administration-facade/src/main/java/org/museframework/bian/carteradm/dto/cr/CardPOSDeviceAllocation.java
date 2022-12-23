/*Maintain an inventory or holding of some resource and make assignments/allocations as requested  within Card Terminal Administration. 
Example: Track the inventory and administer the distribution of central cash holdings throughout the branch & ATM network.*/
package org.museframework.bian.carteradm.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CardPOSDeviceAllocation extends org.museframework.bian.classes.CardPOSDeviceAllocation {
    /*Reference identification for the POS device*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object cardPOSDeviceReference;

    /*Any unique identification properties (e.g. serial number)*/
    @MetaField
    private String cardPOSDeviceIdentifier;

    /*The specific make and type of device*/
    @MetaField
    private String cardPOSDeviceType;

    /*The type of software running on the device*/
    @MetaField
    private String cardPOSDeviceSoftwareType;

    /*The version of the software on the device*/
    @MetaField
    private String cardPOSDeviceSoftwareVersion;

    /*Date device first obtained, used for maintenance and amortization*/
    @MetaField
    private String cardPOSDeviceAcquiredDate;

    /*Record of the maintenance/repair history of the device*/
    @MetaField
    private String cardPOSRepairRecord;

    /*Description of the repair or maintenance work done (includes costs as appropriate)*/
    @MetaField
    private String cardPOSRepairDetails;

    /*Key dates and times relating to the repair (e.g. reported, scheduled, effort, returned to service)*/
    @MetaField
    private String cardPOSRepairDates;

    /*The status of the POS device (e.g. testing, in production, help inventory, under repair, replaced/terminated)*/
    @MetaField
    private String cardPOSDeviceStatus;

    public void setCardPOSDeviceReference(org.museframework.bian.classes.Object cardPOSDeviceReference) {
        this.cardPOSDeviceReference = cardPOSDeviceReference;
    }

    public org.museframework.bian.classes.Object getCardPOSDeviceReference() {
        return cardPOSDeviceReference;
    }

    public void setCardPOSDeviceIdentifier(String cardPOSDeviceIdentifier) {
        this.cardPOSDeviceIdentifier = cardPOSDeviceIdentifier;
    }

    public String getCardPOSDeviceIdentifier() {
        return cardPOSDeviceIdentifier;
    }

    public void setCardPOSDeviceType(String cardPOSDeviceType) {
        this.cardPOSDeviceType = cardPOSDeviceType;
    }

    public String getCardPOSDeviceType() {
        return cardPOSDeviceType;
    }

    public void setCardPOSDeviceSoftwareType(String cardPOSDeviceSoftwareType) {
        this.cardPOSDeviceSoftwareType = cardPOSDeviceSoftwareType;
    }

    public String getCardPOSDeviceSoftwareType() {
        return cardPOSDeviceSoftwareType;
    }

    public void setCardPOSDeviceSoftwareVersion(String cardPOSDeviceSoftwareVersion) {
        this.cardPOSDeviceSoftwareVersion = cardPOSDeviceSoftwareVersion;
    }

    public String getCardPOSDeviceSoftwareVersion() {
        return cardPOSDeviceSoftwareVersion;
    }

    public void setCardPOSDeviceAcquiredDate(String cardPOSDeviceAcquiredDate) {
        this.cardPOSDeviceAcquiredDate = cardPOSDeviceAcquiredDate;
    }

    public String getCardPOSDeviceAcquiredDate() {
        return cardPOSDeviceAcquiredDate;
    }

    public void setCardPOSRepairRecord(String cardPOSRepairRecord) {
        this.cardPOSRepairRecord = cardPOSRepairRecord;
    }

    public String getCardPOSRepairRecord() {
        return cardPOSRepairRecord;
    }

    public void setCardPOSRepairDetails(String cardPOSRepairDetails) {
        this.cardPOSRepairDetails = cardPOSRepairDetails;
    }

    public String getCardPOSRepairDetails() {
        return cardPOSRepairDetails;
    }

    public void setCardPOSRepairDates(String cardPOSRepairDates) {
        this.cardPOSRepairDates = cardPOSRepairDates;
    }

    public String getCardPOSRepairDates() {
        return cardPOSRepairDates;
    }

    public void setCardPOSDeviceStatus(String cardPOSDeviceStatus) {
        this.cardPOSDeviceStatus = cardPOSDeviceStatus;
    }

    public String getCardPOSDeviceStatus() {
        return cardPOSDeviceStatus;
    }
}