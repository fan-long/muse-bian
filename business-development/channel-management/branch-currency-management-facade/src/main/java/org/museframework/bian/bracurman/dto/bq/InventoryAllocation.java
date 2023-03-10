/*Set of rules for the purpose of deciding if or if not something is applicable

Examples: Staff assignment, Facility allocation.*/
package org.museframework.bian.bracurman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class InventoryAllocation {
    /*The required status/situation before the allocation can be made*/
    @MetaField(0)
    private String inventoryAllocationPreconditions;

    /*The schedule and timing of allocation decisions*/
    @MetaField(0)
    private String inventoryAllocationAllocationSchedule;

    /*The Branch Cash Allocation specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService cashInventoryAllocation;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String cashInventoryAllocationServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String cashInventoryAllocationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String cashInventoryAllocationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String cashInventoryAllocationServiceWorkProduct;

    /**/
    @MetaField(0)
    private String cashInventoryAllocationServiceName;

    public void setInventoryAllocationPreconditions(String inventoryAllocationPreconditions) {
        this.inventoryAllocationPreconditions = inventoryAllocationPreconditions;
    }

    public String getInventoryAllocationPreconditions() {
        return inventoryAllocationPreconditions;
    }

    public void setInventoryAllocationAllocationSchedule(String inventoryAllocationAllocationSchedule) {
        this.inventoryAllocationAllocationSchedule = inventoryAllocationAllocationSchedule;
    }

    public String getInventoryAllocationAllocationSchedule() {
        return inventoryAllocationAllocationSchedule;
    }

    public void setCashInventoryAllocation(org.museframework.bian.classes.BusinessService cashInventoryAllocation) {
        this.cashInventoryAllocation = cashInventoryAllocation;
    }

    public org.museframework.bian.classes.BusinessService getCashInventoryAllocation() {
        return cashInventoryAllocation;
    }

    public void setCashInventoryAllocationServiceType(String cashInventoryAllocationServiceType) {
        this.cashInventoryAllocationServiceType = cashInventoryAllocationServiceType;
    }

    public String getCashInventoryAllocationServiceType() {
        return cashInventoryAllocationServiceType;
    }

    public void setCashInventoryAllocationServiceDescription(String cashInventoryAllocationServiceDescription) {
        this.cashInventoryAllocationServiceDescription = cashInventoryAllocationServiceDescription;
    }

    public String getCashInventoryAllocationServiceDescription() {
        return cashInventoryAllocationServiceDescription;
    }

    public void setCashInventoryAllocationServiceInputsandOuputs(String cashInventoryAllocationServiceInputsandOuputs) {
        this.cashInventoryAllocationServiceInputsandOuputs = cashInventoryAllocationServiceInputsandOuputs;
    }

    public String getCashInventoryAllocationServiceInputsandOuputs() {
        return cashInventoryAllocationServiceInputsandOuputs;
    }

    public void setCashInventoryAllocationServiceWorkProduct(String cashInventoryAllocationServiceWorkProduct) {
        this.cashInventoryAllocationServiceWorkProduct = cashInventoryAllocationServiceWorkProduct;
    }

    public String getCashInventoryAllocationServiceWorkProduct() {
        return cashInventoryAllocationServiceWorkProduct;
    }

    public void setCashInventoryAllocationServiceName(String cashInventoryAllocationServiceName) {
        this.cashInventoryAllocationServiceName = cashInventoryAllocationServiceName;
    }

    public String getCashInventoryAllocationServiceName() {
        return cashInventoryAllocationServiceName;
    }
}