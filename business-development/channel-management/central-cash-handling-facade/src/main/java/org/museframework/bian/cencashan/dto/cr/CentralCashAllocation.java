/*Maintain an inventory or holding of some resource and make assignments/allocations as requested  within Central Cash Handling. 
Example: Track the inventory and administer the distribution of central cash holdings throughout the branch & ATM network.*/
package org.museframework.bian.cencashan.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CentralCashAllocation {
    /*A Classification value that distinguishes between allocation Options according to the optional business services defined within Central Cash Allocation*/
    @MetaField(0)
    private String centralCashAllocationParameterType;

    /*A selected optional business service for which resources are allocated*/
    @MetaField(0)
    private String centralCashAllocationSelectedOption;

    /*A Classification value, that distinguishes between the the type of resource allocated withing the Central Cash Allocation*/
    @MetaField(0)
    private String centralCashAllocationType;

    /*Documentation of Central Cash Allocation*/
    @MetaField(0)
    private String centralCashAllocationDescription;

    /*Request to allocate CentralCash*/
    @MetaField(0)
    private String centralCashAllocationRequest;

    /*Timetable to allocate CentralCash*/
    @MetaField(0)
    private String centralCashAllocationSchedule;

    /*The status of Central Cash Allocation*/
    @MetaField(0)
    private String centralCashAllocationStatus;

    /*Reference to the party who is involved in Central Cash Allocation*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object centralCashAllocationReference;

    /*Reference to the customer who is involved in Central Cash Allocation*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object centralCashAllocationCustomerReference;

    /*The curreny which is arranged/used for Central Cash Allocation*/
    @MetaField(0)
    private String centralCashAllocationCurrency;

    /*Reference to the regulation which is defined for Central Cash Allocation*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object centralCashAllocationRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Central Cash Allocation*/
    @MetaField(0)
    private String centralCashAllocationRegulationType;

    /*Reference to the jurisdiction that is assigned to Central Cash Allocation in case of legal dispute.*/
    @MetaField(0)
    private String centralCashAllocationJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement, are entered.*/
    @MetaField(0)
    private String centralCashAllocationBookingLocation;

    /*The type of account which is linked to Central Cash Allocation*/
    @MetaField(0)
    private String centralCashAllocationAccountType;

    /*Reference to the account which is linked to Central Cash Allocation*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object centralCashAllocationAccountReference;

    /*Reference to Central Cash Allocation Instance*/
    @MetaField(0)
    private String centralCashAllocationInstance;

    public void setCentralCashAllocationParameterType(String centralCashAllocationParameterType) {
        this.centralCashAllocationParameterType = centralCashAllocationParameterType;
    }

    public String getCentralCashAllocationParameterType() {
        return centralCashAllocationParameterType;
    }

    public void setCentralCashAllocationSelectedOption(String centralCashAllocationSelectedOption) {
        this.centralCashAllocationSelectedOption = centralCashAllocationSelectedOption;
    }

    public String getCentralCashAllocationSelectedOption() {
        return centralCashAllocationSelectedOption;
    }

    public void setCentralCashAllocationType(String centralCashAllocationType) {
        this.centralCashAllocationType = centralCashAllocationType;
    }

    public String getCentralCashAllocationType() {
        return centralCashAllocationType;
    }

    public void setCentralCashAllocationDescription(String centralCashAllocationDescription) {
        this.centralCashAllocationDescription = centralCashAllocationDescription;
    }

    public String getCentralCashAllocationDescription() {
        return centralCashAllocationDescription;
    }

    public void setCentralCashAllocationRequest(String centralCashAllocationRequest) {
        this.centralCashAllocationRequest = centralCashAllocationRequest;
    }

    public String getCentralCashAllocationRequest() {
        return centralCashAllocationRequest;
    }

    public void setCentralCashAllocationSchedule(String centralCashAllocationSchedule) {
        this.centralCashAllocationSchedule = centralCashAllocationSchedule;
    }

    public String getCentralCashAllocationSchedule() {
        return centralCashAllocationSchedule;
    }

    public void setCentralCashAllocationStatus(String centralCashAllocationStatus) {
        this.centralCashAllocationStatus = centralCashAllocationStatus;
    }

    public String getCentralCashAllocationStatus() {
        return centralCashAllocationStatus;
    }

    public void setCentralCashAllocationReference(org.museframework.bian.classes.Object centralCashAllocationReference) {
        this.centralCashAllocationReference = centralCashAllocationReference;
    }

    public org.museframework.bian.classes.Object getCentralCashAllocationReference() {
        return centralCashAllocationReference;
    }

    public void setCentralCashAllocationCustomerReference(org.museframework.bian.classes.Object centralCashAllocationCustomerReference) {
        this.centralCashAllocationCustomerReference = centralCashAllocationCustomerReference;
    }

    public org.museframework.bian.classes.Object getCentralCashAllocationCustomerReference() {
        return centralCashAllocationCustomerReference;
    }

    public void setCentralCashAllocationCurrency(String centralCashAllocationCurrency) {
        this.centralCashAllocationCurrency = centralCashAllocationCurrency;
    }

    public String getCentralCashAllocationCurrency() {
        return centralCashAllocationCurrency;
    }

    public void setCentralCashAllocationRegulationReference(org.museframework.bian.classes.Object centralCashAllocationRegulationReference) {
        this.centralCashAllocationRegulationReference = centralCashAllocationRegulationReference;
    }

    public org.museframework.bian.classes.Object getCentralCashAllocationRegulationReference() {
        return centralCashAllocationRegulationReference;
    }

    public void setCentralCashAllocationRegulationType(String centralCashAllocationRegulationType) {
        this.centralCashAllocationRegulationType = centralCashAllocationRegulationType;
    }

    public String getCentralCashAllocationRegulationType() {
        return centralCashAllocationRegulationType;
    }

    public void setCentralCashAllocationJurisdiction(String centralCashAllocationJurisdiction) {
        this.centralCashAllocationJurisdiction = centralCashAllocationJurisdiction;
    }

    public String getCentralCashAllocationJurisdiction() {
        return centralCashAllocationJurisdiction;
    }

    public void setCentralCashAllocationBookingLocation(String centralCashAllocationBookingLocation) {
        this.centralCashAllocationBookingLocation = centralCashAllocationBookingLocation;
    }

    public String getCentralCashAllocationBookingLocation() {
        return centralCashAllocationBookingLocation;
    }

    public void setCentralCashAllocationAccountType(String centralCashAllocationAccountType) {
        this.centralCashAllocationAccountType = centralCashAllocationAccountType;
    }

    public String getCentralCashAllocationAccountType() {
        return centralCashAllocationAccountType;
    }

    public void setCentralCashAllocationAccountReference(org.museframework.bian.classes.Object centralCashAllocationAccountReference) {
        this.centralCashAllocationAccountReference = centralCashAllocationAccountReference;
    }

    public org.museframework.bian.classes.Object getCentralCashAllocationAccountReference() {
        return centralCashAllocationAccountReference;
    }

    public void setCentralCashAllocationInstance(String centralCashAllocationInstance) {
        this.centralCashAllocationInstance = centralCashAllocationInstance;
    }

    public String getCentralCashAllocationInstance() {
        return centralCashAllocationInstance;
    }
}