/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Collections. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.collections.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CollectionsAccountUpdate {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(0)
    private String collectionsAccountUpdatePreconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collectionsAccountUpdateBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField(0)
    private String collectionsAccountUpdateWorkSchedule;

    /*The Collateral Asset Liquidation Procedure specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService collectionsAccountUpdate;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField(0)
    private String collectionsAccountUpdatePostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String collectionsAccountUpdateCollectionsAccountUpdateServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String collectionsAccountUpdateCollectionsAccountUpdateServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String collectionsAccountUpdateCollectionsAccountUpdateServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String collectionsAccountUpdateCollectionsAccountUpdateServiceWorkProduct;

    /**/
    @MetaField(0)
    private String collectionsAccountUpdateCollectionsAccountUpdateServiceName;

    public void setCollectionsAccountUpdatePreconditions(String collectionsAccountUpdatePreconditions) {
        this.collectionsAccountUpdatePreconditions = collectionsAccountUpdatePreconditions;
    }

    public String getCollectionsAccountUpdatePreconditions() {
        return collectionsAccountUpdatePreconditions;
    }

    public void setCollectionsAccountUpdateBusinessUnitEmployeeReference(org.museframework.bian.classes.Object collectionsAccountUpdateBusinessUnitEmployeeReference) {
        this.collectionsAccountUpdateBusinessUnitEmployeeReference = collectionsAccountUpdateBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getCollectionsAccountUpdateBusinessUnitEmployeeReference() {
        return collectionsAccountUpdateBusinessUnitEmployeeReference;
    }

    public void setCollectionsAccountUpdateWorkSchedule(String collectionsAccountUpdateWorkSchedule) {
        this.collectionsAccountUpdateWorkSchedule = collectionsAccountUpdateWorkSchedule;
    }

    public String getCollectionsAccountUpdateWorkSchedule() {
        return collectionsAccountUpdateWorkSchedule;
    }

    public void setCollectionsAccountUpdate(org.museframework.bian.classes.BusinessService collectionsAccountUpdate) {
        this.collectionsAccountUpdate = collectionsAccountUpdate;
    }

    public org.museframework.bian.classes.BusinessService getCollectionsAccountUpdate() {
        return collectionsAccountUpdate;
    }

    public void setCollectionsAccountUpdatePostconditions(String collectionsAccountUpdatePostconditions) {
        this.collectionsAccountUpdatePostconditions = collectionsAccountUpdatePostconditions;
    }

    public String getCollectionsAccountUpdatePostconditions() {
        return collectionsAccountUpdatePostconditions;
    }

    public void setCollectionsAccountUpdateCollectionsAccountUpdateServiceType(String collectionsAccountUpdateCollectionsAccountUpdateServiceType) {
        this.collectionsAccountUpdateCollectionsAccountUpdateServiceType = collectionsAccountUpdateCollectionsAccountUpdateServiceType;
    }

    public String getCollectionsAccountUpdateCollectionsAccountUpdateServiceType() {
        return collectionsAccountUpdateCollectionsAccountUpdateServiceType;
    }

    public void setCollectionsAccountUpdateCollectionsAccountUpdateServiceDescription(String collectionsAccountUpdateCollectionsAccountUpdateServiceDescription) {
        this.collectionsAccountUpdateCollectionsAccountUpdateServiceDescription = collectionsAccountUpdateCollectionsAccountUpdateServiceDescription;
    }

    public String getCollectionsAccountUpdateCollectionsAccountUpdateServiceDescription() {
        return collectionsAccountUpdateCollectionsAccountUpdateServiceDescription;
    }

    public void setCollectionsAccountUpdateCollectionsAccountUpdateServiceInputsandOuputs(String collectionsAccountUpdateCollectionsAccountUpdateServiceInputsandOuputs) {
        this.collectionsAccountUpdateCollectionsAccountUpdateServiceInputsandOuputs = collectionsAccountUpdateCollectionsAccountUpdateServiceInputsandOuputs;
    }

    public String getCollectionsAccountUpdateCollectionsAccountUpdateServiceInputsandOuputs() {
        return collectionsAccountUpdateCollectionsAccountUpdateServiceInputsandOuputs;
    }

    public void setCollectionsAccountUpdateCollectionsAccountUpdateServiceWorkProduct(String collectionsAccountUpdateCollectionsAccountUpdateServiceWorkProduct) {
        this.collectionsAccountUpdateCollectionsAccountUpdateServiceWorkProduct = collectionsAccountUpdateCollectionsAccountUpdateServiceWorkProduct;
    }

    public String getCollectionsAccountUpdateCollectionsAccountUpdateServiceWorkProduct() {
        return collectionsAccountUpdateCollectionsAccountUpdateServiceWorkProduct;
    }

    public void setCollectionsAccountUpdateCollectionsAccountUpdateServiceName(String collectionsAccountUpdateCollectionsAccountUpdateServiceName) {
        this.collectionsAccountUpdateCollectionsAccountUpdateServiceName = collectionsAccountUpdateCollectionsAccountUpdateServiceName;
    }

    public String getCollectionsAccountUpdateCollectionsAccountUpdateServiceName() {
        return collectionsAccountUpdateCollectionsAccountUpdateServiceName;
    }
}