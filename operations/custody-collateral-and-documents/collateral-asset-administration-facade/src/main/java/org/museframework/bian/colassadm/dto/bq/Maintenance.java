/*A collection of one or more clerical routines that are to be followed to administer the operational unit/function

Examples: Time-sheet recording*/
package org.museframework.bian.colassadm.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Maintenance {
    /*The type of action or check performed to oversee maintenance (e.g. insurance coverage, upkeep review)*/
    @MetaField
    private String collateralAssetMaintenanceTaskType;

    /*Reference to 3rd party maintenance service provider (e.g. insurer, custodian)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralAssetMaintenanceServiceProviderReference_3rdpartyserviceprovider_;

    /*A record of the verification checks performed against the schedule*/
    @MetaField
    private String collateralAssetVerificationandComplianceRecord;

    /*Record of any fees incurred in the collateral asset maintenance (e.g. 3rd party fees)*/
    @MetaField
    private String collateralAssetMaintenanceSafekeepingFees;

    public void setCollateralAssetMaintenanceTaskType(String collateralAssetMaintenanceTaskType) {
        this.collateralAssetMaintenanceTaskType = collateralAssetMaintenanceTaskType;
    }

    public String getCollateralAssetMaintenanceTaskType() {
        return collateralAssetMaintenanceTaskType;
    }

    public void setCollateralAssetMaintenanceServiceProviderReference_3rdpartyserviceprovider_(org.museframework.bian.classes.Object collateralAssetMaintenanceServiceProviderReference_3rdpartyserviceprovider_) {
        this.collateralAssetMaintenanceServiceProviderReference_3rdpartyserviceprovider_ = collateralAssetMaintenanceServiceProviderReference_3rdpartyserviceprovider_;
    }

    public org.museframework.bian.classes.Object getCollateralAssetMaintenanceServiceProviderReference_3rdpartyserviceprovider_() {
        return collateralAssetMaintenanceServiceProviderReference_3rdpartyserviceprovider_;
    }

    public void setCollateralAssetVerificationandComplianceRecord(String collateralAssetVerificationandComplianceRecord) {
        this.collateralAssetVerificationandComplianceRecord = collateralAssetVerificationandComplianceRecord;
    }

    public String getCollateralAssetVerificationandComplianceRecord() {
        return collateralAssetVerificationandComplianceRecord;
    }

    public void setCollateralAssetMaintenanceSafekeepingFees(String collateralAssetMaintenanceSafekeepingFees) {
        this.collateralAssetMaintenanceSafekeepingFees = collateralAssetMaintenanceSafekeepingFees;
    }

    public String getCollateralAssetMaintenanceSafekeepingFees() {
        return collateralAssetMaintenanceSafekeepingFees;
    }
}