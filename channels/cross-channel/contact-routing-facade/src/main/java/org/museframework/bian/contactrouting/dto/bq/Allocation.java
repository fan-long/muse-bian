/*Set of rules for the purpose of deciding if or if not something is applicable

Examples: Staff assignment, Facility allocation.*/
package org.museframework.bian.contactrouting.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Allocation extends org.museframework.bian.classes.Allocation {
    /*Defines the type of allocation (e.g. next available, qualification based, future reservation)*/
    @MetaField
    private String allocationRequestType;

    /*Contains details of servicing resource request. This can be simple for next available agent, or detail specific required qualifications and expertise*/
    @MetaField
    private String customerServicingRequestRecord;

    /*Extracts from the active contact can be used to support more advance selection logic to identify the best available servicing specialist resource*/
    @MetaField
    private String customerContactRecord;

    /*The result of the allocation task*/
    @MetaField
    private String allocationTaskResult;

    public void setAllocationRequestType(String allocationRequestType) {
        this.allocationRequestType = allocationRequestType;
    }

    public String getAllocationRequestType() {
        return allocationRequestType;
    }

    public void setCustomerServicingRequestRecord(String customerServicingRequestRecord) {
        this.customerServicingRequestRecord = customerServicingRequestRecord;
    }

    public String getCustomerServicingRequestRecord() {
        return customerServicingRequestRecord;
    }

    public void setCustomerContactRecord(String customerContactRecord) {
        this.customerContactRecord = customerContactRecord;
    }

    public String getCustomerContactRecord() {
        return customerContactRecord;
    }

    public void setAllocationTaskResult(String allocationTaskResult) {
        this.allocationTaskResult = allocationTaskResult;
    }

    public String getAllocationTaskResult() {
        return allocationTaskResult;
    }
}