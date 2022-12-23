/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.bracurdis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class InventoryDistributionOversight {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField
    private String inventoryDistributionOversightPreconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object inventoryDistributionOversightBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField
    private String inventoryDistributionOversightWorkSchedule;

    /*The Cash Distribution Procedure specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService inventoryDistributionOversight;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField
    private String inventoryDistributionOversightPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String inventoryDistributionOversightInventoryDistributionOversightServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String inventoryDistributionOversightInventoryDistributionOversightServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String inventoryDistributionOversightInventoryDistributionOversightServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String inventoryDistributionOversightInventoryDistributionOversightServiceWorkProduct;

    /**/
    @MetaField
    private String inventoryDistributionOversightInventoryDistributionOversightServiceName;

    public void setInventoryDistributionOversightPreconditions(String inventoryDistributionOversightPreconditions) {
        this.inventoryDistributionOversightPreconditions = inventoryDistributionOversightPreconditions;
    }

    public String getInventoryDistributionOversightPreconditions() {
        return inventoryDistributionOversightPreconditions;
    }

    public void setInventoryDistributionOversightBusinessUnitEmployeeReference(org.museframework.bian.classes.Object inventoryDistributionOversightBusinessUnitEmployeeReference) {
        this.inventoryDistributionOversightBusinessUnitEmployeeReference = inventoryDistributionOversightBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getInventoryDistributionOversightBusinessUnitEmployeeReference() {
        return inventoryDistributionOversightBusinessUnitEmployeeReference;
    }

    public void setInventoryDistributionOversightWorkSchedule(String inventoryDistributionOversightWorkSchedule) {
        this.inventoryDistributionOversightWorkSchedule = inventoryDistributionOversightWorkSchedule;
    }

    public String getInventoryDistributionOversightWorkSchedule() {
        return inventoryDistributionOversightWorkSchedule;
    }

    public void setInventoryDistributionOversight(org.museframework.bian.classes.BusinessService inventoryDistributionOversight) {
        this.inventoryDistributionOversight = inventoryDistributionOversight;
    }

    public org.museframework.bian.classes.BusinessService getInventoryDistributionOversight() {
        return inventoryDistributionOversight;
    }

    public void setInventoryDistributionOversightPostconditions(String inventoryDistributionOversightPostconditions) {
        this.inventoryDistributionOversightPostconditions = inventoryDistributionOversightPostconditions;
    }

    public String getInventoryDistributionOversightPostconditions() {
        return inventoryDistributionOversightPostconditions;
    }

    public void setInventoryDistributionOversightInventoryDistributionOversightServiceType(String inventoryDistributionOversightInventoryDistributionOversightServiceType) {
        this.inventoryDistributionOversightInventoryDistributionOversightServiceType = inventoryDistributionOversightInventoryDistributionOversightServiceType;
    }

    public String getInventoryDistributionOversightInventoryDistributionOversightServiceType() {
        return inventoryDistributionOversightInventoryDistributionOversightServiceType;
    }

    public void setInventoryDistributionOversightInventoryDistributionOversightServiceDescription(String inventoryDistributionOversightInventoryDistributionOversightServiceDescription) {
        this.inventoryDistributionOversightInventoryDistributionOversightServiceDescription = inventoryDistributionOversightInventoryDistributionOversightServiceDescription;
    }

    public String getInventoryDistributionOversightInventoryDistributionOversightServiceDescription() {
        return inventoryDistributionOversightInventoryDistributionOversightServiceDescription;
    }

    public void setInventoryDistributionOversightInventoryDistributionOversightServiceInputsandOuputs(String inventoryDistributionOversightInventoryDistributionOversightServiceInputsandOuputs) {
        this.inventoryDistributionOversightInventoryDistributionOversightServiceInputsandOuputs = inventoryDistributionOversightInventoryDistributionOversightServiceInputsandOuputs;
    }

    public String getInventoryDistributionOversightInventoryDistributionOversightServiceInputsandOuputs() {
        return inventoryDistributionOversightInventoryDistributionOversightServiceInputsandOuputs;
    }

    public void setInventoryDistributionOversightInventoryDistributionOversightServiceWorkProduct(String inventoryDistributionOversightInventoryDistributionOversightServiceWorkProduct) {
        this.inventoryDistributionOversightInventoryDistributionOversightServiceWorkProduct = inventoryDistributionOversightInventoryDistributionOversightServiceWorkProduct;
    }

    public String getInventoryDistributionOversightInventoryDistributionOversightServiceWorkProduct() {
        return inventoryDistributionOversightInventoryDistributionOversightServiceWorkProduct;
    }

    public void setInventoryDistributionOversightInventoryDistributionOversightServiceName(String inventoryDistributionOversightInventoryDistributionOversightServiceName) {
        this.inventoryDistributionOversightInventoryDistributionOversightServiceName = inventoryDistributionOversightInventoryDistributionOversightServiceName;
    }

    public String getInventoryDistributionOversightInventoryDistributionOversightServiceName() {
        return inventoryDistributionOversightInventoryDistributionOversightServiceName;
    }
}