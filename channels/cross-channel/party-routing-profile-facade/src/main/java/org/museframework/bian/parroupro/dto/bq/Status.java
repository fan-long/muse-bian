/*A collection of information feeds/measures that can be used to track the status of one or more items/entitites

Examples: Composite position, Customer alert*/
package org.museframework.bian.parroupro.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Status {
    /*Defines the type of status (e.g. account in distress)*/
    @MetaField(0)
    private String customerRelationshipStatusType;

    /*The maintained state value (historical values may be retained as appropriate)*/
    @MetaField(0)
    private String customerRelationshipStatus;

    /*Explanation/description for given status value if necessary*/
    @MetaField(0)
    private String customerRelationshipStatusNarrative;

    /*Indication when the status value is updated and time until given value applies/is relevant as appropriate*/
    @MetaField(0)
    private String customerRelationshipStatusValidFromToDate;

    public void setCustomerRelationshipStatusType(String customerRelationshipStatusType) {
        this.customerRelationshipStatusType = customerRelationshipStatusType;
    }

    public String getCustomerRelationshipStatusType() {
        return customerRelationshipStatusType;
    }

    public void setCustomerRelationshipStatus(String customerRelationshipStatus) {
        this.customerRelationshipStatus = customerRelationshipStatus;
    }

    public String getCustomerRelationshipStatus() {
        return customerRelationshipStatus;
    }

    public void setCustomerRelationshipStatusNarrative(String customerRelationshipStatusNarrative) {
        this.customerRelationshipStatusNarrative = customerRelationshipStatusNarrative;
    }

    public String getCustomerRelationshipStatusNarrative() {
        return customerRelationshipStatusNarrative;
    }

    public void setCustomerRelationshipStatusValidFromToDate(String customerRelationshipStatusValidFromToDate) {
        this.customerRelationshipStatusValidFromToDate = customerRelationshipStatusValidFromToDate;
    }

    public String getCustomerRelationshipStatusValidFromToDate() {
        return customerRelationshipStatusValidFromToDate;
    }
}