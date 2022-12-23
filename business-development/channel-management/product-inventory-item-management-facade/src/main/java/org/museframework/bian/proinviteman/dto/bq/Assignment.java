/*Set of rules for the purpose of deciding if or if not something is applicable

Examples: Staff assignment, Facility allocation.*/
package org.museframework.bian.proinviteman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Assignment {
    /*Defines the type of assignment (e.g. to schedule, ad-hoc inventory request)*/
    @MetaField
    private String productInventoryAssignmentRequestType;

    /*Contains details of the product inventory request, in particular the item type, amount and delivery arrangements*/
    @MetaField
    private String productInventoryAssignmentRequestRecord;

    /*Details of the distribution of product inventory to a location*/
    @MetaField
    private String productInventoryAssignmentDeliveryRecord;

    /*Details of inventory and delivery related costs*/
    @MetaField
    private String productInventoryAssignmentCosts;

    /*Key dates associated with the assignment (e.g. order date, confirmation date, delivery date)*/
    @MetaField
    private String dateType;

    /*Value of the specific date type*/
    @MetaField
    private String date;

    public void setProductInventoryAssignmentRequestType(String productInventoryAssignmentRequestType) {
        this.productInventoryAssignmentRequestType = productInventoryAssignmentRequestType;
    }

    public String getProductInventoryAssignmentRequestType() {
        return productInventoryAssignmentRequestType;
    }

    public void setProductInventoryAssignmentRequestRecord(String productInventoryAssignmentRequestRecord) {
        this.productInventoryAssignmentRequestRecord = productInventoryAssignmentRequestRecord;
    }

    public String getProductInventoryAssignmentRequestRecord() {
        return productInventoryAssignmentRequestRecord;
    }

    public void setProductInventoryAssignmentDeliveryRecord(String productInventoryAssignmentDeliveryRecord) {
        this.productInventoryAssignmentDeliveryRecord = productInventoryAssignmentDeliveryRecord;
    }

    public String getProductInventoryAssignmentDeliveryRecord() {
        return productInventoryAssignmentDeliveryRecord;
    }

    public void setProductInventoryAssignmentCosts(String productInventoryAssignmentCosts) {
        this.productInventoryAssignmentCosts = productInventoryAssignmentCosts;
    }

    public String getProductInventoryAssignmentCosts() {
        return productInventoryAssignmentCosts;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}