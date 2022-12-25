/*Monitor and define the status/rating of some entity within Position Management. */
package org.museframework.bian.positionmanagement.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.FinancialPositionState
@MetaDto
public class FinancialPositionState {
    /*The type of position being monitored (e.g. consolidated customer exposure, geographic/sector exposure)*/
    @MetaField(0)
    private String positionType;

    /*The customer or customer type associated with the position if applicable*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object positionCustomerReference;

    /*The sector or segment associated with the position if applicable*/
    @MetaField(0)
    private String positionSector;

    /*The product type or specific product associated with the position if applicable*/
    @MetaField(0)
    private String positionProductType;

    /*Description of the specification and purpose position monitoring (e.g. real-time limit, trend)*/
    @MetaField(0)
    private String positionDefinition;

    /*Thresholds limits associated with the position*/
    @MetaField(0)
    private String positionThresholdsLimits;

    /*The current, historical and if applicable projected values of the monitored position*/
    @MetaField(0)
    private String positionValue;

    /*Reference to a notification source requesting updates on position changes*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object positionNotificationArrangementReference;

    /*The details maintained for the notification service*/
    @MetaField(0)
    private String positionNotificationArrangementRecord;

    /*Reference to the notified party*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object positionNotificationBusinessUnitReference;

    /*Details of the requirements/schedule for position notification*/
    @MetaField(0)
    private String positionNotificationDetails;

    /*The position notification record generated as required*/
    @MetaField(0)
    private String positionNotificationRecord;

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionCustomerReference(org.museframework.bian.classes.Object positionCustomerReference) {
        this.positionCustomerReference = positionCustomerReference;
    }

    public org.museframework.bian.classes.Object getPositionCustomerReference() {
        return positionCustomerReference;
    }

    public void setPositionSector(String positionSector) {
        this.positionSector = positionSector;
    }

    public String getPositionSector() {
        return positionSector;
    }

    public void setPositionProductType(String positionProductType) {
        this.positionProductType = positionProductType;
    }

    public String getPositionProductType() {
        return positionProductType;
    }

    public void setPositionDefinition(String positionDefinition) {
        this.positionDefinition = positionDefinition;
    }

    public String getPositionDefinition() {
        return positionDefinition;
    }

    public void setPositionThresholdsLimits(String positionThresholdsLimits) {
        this.positionThresholdsLimits = positionThresholdsLimits;
    }

    public String getPositionThresholdsLimits() {
        return positionThresholdsLimits;
    }

    public void setPositionValue(String positionValue) {
        this.positionValue = positionValue;
    }

    public String getPositionValue() {
        return positionValue;
    }

    public void setPositionNotificationArrangementReference(org.museframework.bian.classes.Object positionNotificationArrangementReference) {
        this.positionNotificationArrangementReference = positionNotificationArrangementReference;
    }

    public org.museframework.bian.classes.Object getPositionNotificationArrangementReference() {
        return positionNotificationArrangementReference;
    }

    public void setPositionNotificationArrangementRecord(String positionNotificationArrangementRecord) {
        this.positionNotificationArrangementRecord = positionNotificationArrangementRecord;
    }

    public String getPositionNotificationArrangementRecord() {
        return positionNotificationArrangementRecord;
    }

    public void setPositionNotificationBusinessUnitReference(org.museframework.bian.classes.Object positionNotificationBusinessUnitReference) {
        this.positionNotificationBusinessUnitReference = positionNotificationBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getPositionNotificationBusinessUnitReference() {
        return positionNotificationBusinessUnitReference;
    }

    public void setPositionNotificationDetails(String positionNotificationDetails) {
        this.positionNotificationDetails = positionNotificationDetails;
    }

    public String getPositionNotificationDetails() {
        return positionNotificationDetails;
    }

    public void setPositionNotificationRecord(String positionNotificationRecord) {
        this.positionNotificationRecord = positionNotificationRecord;
    }

    public String getPositionNotificationRecord() {
        return positionNotificationRecord;
    }
}