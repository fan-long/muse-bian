/*Set of rules for the purpose of deciding if or if not something is applicable

Examples: Staff assignment, Facility allocation.*/
package org.museframework.bian.cencashan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProjectionandAllocation {
    /*The required status/situation before the allocation can be made*/
    @MetaField(0)
    private String projectionandAllocationPreconditions;

    /*The schedule and timing of allocation decisions*/
    @MetaField(0)
    private String projectionandAllocationAllocationSchedule;

    /*The Central Cash Allocation specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService cashInventoryProjection;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String cashInventoryProjectionServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String cashInventoryProjectionServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String cashInventoryProjectionServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String cashInventoryProjectionServiceWorkProduct;

    /**/
    @MetaField(0)
    private String cashInventoryProjectionServiceName;

    public void setProjectionandAllocationPreconditions(String projectionandAllocationPreconditions) {
        this.projectionandAllocationPreconditions = projectionandAllocationPreconditions;
    }

    public String getProjectionandAllocationPreconditions() {
        return projectionandAllocationPreconditions;
    }

    public void setProjectionandAllocationAllocationSchedule(String projectionandAllocationAllocationSchedule) {
        this.projectionandAllocationAllocationSchedule = projectionandAllocationAllocationSchedule;
    }

    public String getProjectionandAllocationAllocationSchedule() {
        return projectionandAllocationAllocationSchedule;
    }

    public void setCashInventoryProjection(org.museframework.bian.classes.BusinessService cashInventoryProjection) {
        this.cashInventoryProjection = cashInventoryProjection;
    }

    public org.museframework.bian.classes.BusinessService getCashInventoryProjection() {
        return cashInventoryProjection;
    }

    public void setCashInventoryProjectionServiceType(String cashInventoryProjectionServiceType) {
        this.cashInventoryProjectionServiceType = cashInventoryProjectionServiceType;
    }

    public String getCashInventoryProjectionServiceType() {
        return cashInventoryProjectionServiceType;
    }

    public void setCashInventoryProjectionServiceDescription(String cashInventoryProjectionServiceDescription) {
        this.cashInventoryProjectionServiceDescription = cashInventoryProjectionServiceDescription;
    }

    public String getCashInventoryProjectionServiceDescription() {
        return cashInventoryProjectionServiceDescription;
    }

    public void setCashInventoryProjectionServiceInputsandOuputs(String cashInventoryProjectionServiceInputsandOuputs) {
        this.cashInventoryProjectionServiceInputsandOuputs = cashInventoryProjectionServiceInputsandOuputs;
    }

    public String getCashInventoryProjectionServiceInputsandOuputs() {
        return cashInventoryProjectionServiceInputsandOuputs;
    }

    public void setCashInventoryProjectionServiceWorkProduct(String cashInventoryProjectionServiceWorkProduct) {
        this.cashInventoryProjectionServiceWorkProduct = cashInventoryProjectionServiceWorkProduct;
    }

    public String getCashInventoryProjectionServiceWorkProduct() {
        return cashInventoryProjectionServiceWorkProduct;
    }

    public void setCashInventoryProjectionServiceName(String cashInventoryProjectionServiceName) {
        this.cashInventoryProjectionServiceName = cashInventoryProjectionServiceName;
    }

    public String getCashInventoryProjectionServiceName() {
        return cashInventoryProjectionServiceName;
    }
}