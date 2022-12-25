/*Operate equipment and/or a largely automated facility  within Knowledge Exchange. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.knowledgeexchange.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MaintenanceandAccessAdministration {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(0)
    private String maintenanceandAccessAdministrationPreconditions;

    /*The schedule and timing of the function*/
    @MetaField(0)
    private String maintenanceandAccessAdministrationFunctionSchedule;

    /*The Intellectual Property Exchange Operating Session specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService contentMaintenanceandAccessAdministration;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String contentMaintenanceandAccessAdministrationServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String contentMaintenanceandAccessAdministrationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String contentMaintenanceandAccessAdministrationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String contentMaintenanceandAccessAdministrationServiceWorkProduct;

    /**/
    @MetaField(0)
    private String contentMaintenanceandAccessAdministrationServiceName;

    public void setMaintenanceandAccessAdministrationPreconditions(String maintenanceandAccessAdministrationPreconditions) {
        this.maintenanceandAccessAdministrationPreconditions = maintenanceandAccessAdministrationPreconditions;
    }

    public String getMaintenanceandAccessAdministrationPreconditions() {
        return maintenanceandAccessAdministrationPreconditions;
    }

    public void setMaintenanceandAccessAdministrationFunctionSchedule(String maintenanceandAccessAdministrationFunctionSchedule) {
        this.maintenanceandAccessAdministrationFunctionSchedule = maintenanceandAccessAdministrationFunctionSchedule;
    }

    public String getMaintenanceandAccessAdministrationFunctionSchedule() {
        return maintenanceandAccessAdministrationFunctionSchedule;
    }

    public void setContentMaintenanceandAccessAdministration(org.museframework.bian.classes.BusinessService contentMaintenanceandAccessAdministration) {
        this.contentMaintenanceandAccessAdministration = contentMaintenanceandAccessAdministration;
    }

    public org.museframework.bian.classes.BusinessService getContentMaintenanceandAccessAdministration() {
        return contentMaintenanceandAccessAdministration;
    }

    public void setContentMaintenanceandAccessAdministrationServiceType(String contentMaintenanceandAccessAdministrationServiceType) {
        this.contentMaintenanceandAccessAdministrationServiceType = contentMaintenanceandAccessAdministrationServiceType;
    }

    public String getContentMaintenanceandAccessAdministrationServiceType() {
        return contentMaintenanceandAccessAdministrationServiceType;
    }

    public void setContentMaintenanceandAccessAdministrationServiceDescription(String contentMaintenanceandAccessAdministrationServiceDescription) {
        this.contentMaintenanceandAccessAdministrationServiceDescription = contentMaintenanceandAccessAdministrationServiceDescription;
    }

    public String getContentMaintenanceandAccessAdministrationServiceDescription() {
        return contentMaintenanceandAccessAdministrationServiceDescription;
    }

    public void setContentMaintenanceandAccessAdministrationServiceInputsandOuputs(String contentMaintenanceandAccessAdministrationServiceInputsandOuputs) {
        this.contentMaintenanceandAccessAdministrationServiceInputsandOuputs = contentMaintenanceandAccessAdministrationServiceInputsandOuputs;
    }

    public String getContentMaintenanceandAccessAdministrationServiceInputsandOuputs() {
        return contentMaintenanceandAccessAdministrationServiceInputsandOuputs;
    }

    public void setContentMaintenanceandAccessAdministrationServiceWorkProduct(String contentMaintenanceandAccessAdministrationServiceWorkProduct) {
        this.contentMaintenanceandAccessAdministrationServiceWorkProduct = contentMaintenanceandAccessAdministrationServiceWorkProduct;
    }

    public String getContentMaintenanceandAccessAdministrationServiceWorkProduct() {
        return contentMaintenanceandAccessAdministrationServiceWorkProduct;
    }

    public void setContentMaintenanceandAccessAdministrationServiceName(String contentMaintenanceandAccessAdministrationServiceName) {
        this.contentMaintenanceandAccessAdministrationServiceName = contentMaintenanceandAccessAdministrationServiceName;
    }

    public String getContentMaintenanceandAccessAdministrationServiceName() {
        return contentMaintenanceandAccessAdministrationServiceName;
    }
}