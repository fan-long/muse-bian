/*Maintain an inventory or holding of some resource and make assignments/allocations as requested  within Branch Currency Management. 
Example: Track the inventory and administer the distribution of central cash holdings throughout the branch & ATM network.*/
package org.museframework.bian.bracurman.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class BranchCashAllocation {
    /*A Classification value that distinguishes between allocation Options according to the optional business services defined within Branch Cash Allocation*/
    @MetaField(0)
    private String branchCashAllocationParameterType;

    /*A selected optional business service for which resources are allocated*/
    @MetaField(0)
    private String branchCashAllocationSelectedOption;

    /*A Classification value, that distinguishes between the the type of resource allocated withing the Branch Cash Allocation*/
    @MetaField(0)
    private String branchCashAllocationType;

    /*Documentation of Branch Cash Allocation*/
    @MetaField(0)
    private String branchCashAllocationDescription;

    /*Request to allocate BranchCash*/
    @MetaField(0)
    private String branchCashAllocationRequest;

    /*Timetable to allocate BranchCash*/
    @MetaField(0)
    private String branchCashAllocationSchedule;

    /*The status of Branch Cash Allocation*/
    @MetaField(0)
    private String branchCashAllocationStatus;

    /*Reference to the party who is involved in Branch Cash Allocation*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object branchCashAllocationReference;

    /*Reference to the customer who is involved in Branch Cash Allocation*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object branchCashAllocationCustomerReference;

    /*The curreny which is arranged/used for Branch Cash Allocation*/
    @MetaField(0)
    private String branchCashAllocationCurrency;

    /*Reference to the regulation which is defined for Branch Cash Allocation*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object branchCashAllocationRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Branch Cash Allocation*/
    @MetaField(0)
    private String branchCashAllocationRegulationType;

    /*Reference to the jurisdiction that is assigned to Branch Cash Allocation in case of legal dispute.*/
    @MetaField(0)
    private String branchCashAllocationJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement, are entered.*/
    @MetaField(0)
    private String branchCashAllocationBookingLocation;

    /*The type of account which is linked to Branch Cash Allocation*/
    @MetaField(0)
    private String branchCashAllocationAccountType;

    /*Reference to the account which is linked to Branch Cash Allocation*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object branchCashAllocationAccountReference;

    /*Reference to Branch Cash Allocation Instance*/
    @MetaField(0)
    private String branchCashAllocationInstance;

    public void setBranchCashAllocationParameterType(String branchCashAllocationParameterType) {
        this.branchCashAllocationParameterType = branchCashAllocationParameterType;
    }

    public String getBranchCashAllocationParameterType() {
        return branchCashAllocationParameterType;
    }

    public void setBranchCashAllocationSelectedOption(String branchCashAllocationSelectedOption) {
        this.branchCashAllocationSelectedOption = branchCashAllocationSelectedOption;
    }

    public String getBranchCashAllocationSelectedOption() {
        return branchCashAllocationSelectedOption;
    }

    public void setBranchCashAllocationType(String branchCashAllocationType) {
        this.branchCashAllocationType = branchCashAllocationType;
    }

    public String getBranchCashAllocationType() {
        return branchCashAllocationType;
    }

    public void setBranchCashAllocationDescription(String branchCashAllocationDescription) {
        this.branchCashAllocationDescription = branchCashAllocationDescription;
    }

    public String getBranchCashAllocationDescription() {
        return branchCashAllocationDescription;
    }

    public void setBranchCashAllocationRequest(String branchCashAllocationRequest) {
        this.branchCashAllocationRequest = branchCashAllocationRequest;
    }

    public String getBranchCashAllocationRequest() {
        return branchCashAllocationRequest;
    }

    public void setBranchCashAllocationSchedule(String branchCashAllocationSchedule) {
        this.branchCashAllocationSchedule = branchCashAllocationSchedule;
    }

    public String getBranchCashAllocationSchedule() {
        return branchCashAllocationSchedule;
    }

    public void setBranchCashAllocationStatus(String branchCashAllocationStatus) {
        this.branchCashAllocationStatus = branchCashAllocationStatus;
    }

    public String getBranchCashAllocationStatus() {
        return branchCashAllocationStatus;
    }

    public void setBranchCashAllocationReference(org.museframework.bian.classes.Object branchCashAllocationReference) {
        this.branchCashAllocationReference = branchCashAllocationReference;
    }

    public org.museframework.bian.classes.Object getBranchCashAllocationReference() {
        return branchCashAllocationReference;
    }

    public void setBranchCashAllocationCustomerReference(org.museframework.bian.classes.Object branchCashAllocationCustomerReference) {
        this.branchCashAllocationCustomerReference = branchCashAllocationCustomerReference;
    }

    public org.museframework.bian.classes.Object getBranchCashAllocationCustomerReference() {
        return branchCashAllocationCustomerReference;
    }

    public void setBranchCashAllocationCurrency(String branchCashAllocationCurrency) {
        this.branchCashAllocationCurrency = branchCashAllocationCurrency;
    }

    public String getBranchCashAllocationCurrency() {
        return branchCashAllocationCurrency;
    }

    public void setBranchCashAllocationRegulationReference(org.museframework.bian.classes.Object branchCashAllocationRegulationReference) {
        this.branchCashAllocationRegulationReference = branchCashAllocationRegulationReference;
    }

    public org.museframework.bian.classes.Object getBranchCashAllocationRegulationReference() {
        return branchCashAllocationRegulationReference;
    }

    public void setBranchCashAllocationRegulationType(String branchCashAllocationRegulationType) {
        this.branchCashAllocationRegulationType = branchCashAllocationRegulationType;
    }

    public String getBranchCashAllocationRegulationType() {
        return branchCashAllocationRegulationType;
    }

    public void setBranchCashAllocationJurisdiction(String branchCashAllocationJurisdiction) {
        this.branchCashAllocationJurisdiction = branchCashAllocationJurisdiction;
    }

    public String getBranchCashAllocationJurisdiction() {
        return branchCashAllocationJurisdiction;
    }

    public void setBranchCashAllocationBookingLocation(String branchCashAllocationBookingLocation) {
        this.branchCashAllocationBookingLocation = branchCashAllocationBookingLocation;
    }

    public String getBranchCashAllocationBookingLocation() {
        return branchCashAllocationBookingLocation;
    }

    public void setBranchCashAllocationAccountType(String branchCashAllocationAccountType) {
        this.branchCashAllocationAccountType = branchCashAllocationAccountType;
    }

    public String getBranchCashAllocationAccountType() {
        return branchCashAllocationAccountType;
    }

    public void setBranchCashAllocationAccountReference(org.museframework.bian.classes.Object branchCashAllocationAccountReference) {
        this.branchCashAllocationAccountReference = branchCashAllocationAccountReference;
    }

    public org.museframework.bian.classes.Object getBranchCashAllocationAccountReference() {
        return branchCashAllocationAccountReference;
    }

    public void setBranchCashAllocationInstance(String branchCashAllocationInstance) {
        this.branchCashAllocationInstance = branchCashAllocationInstance;
    }

    public String getBranchCashAllocationInstance() {
        return branchCashAllocationInstance;
    }
}