/*A request to distribute the product inventory*/
package org.museframework.bian.classes;

public class ProductInventoryAssignmentRequest {
    /*The type of assignment request (e.g. to schedule, ad-hoc inventory request)*/
    private String productInventoryAssignmentRequestType;

    /*Key dates associated with the assignment request (e.g. order date, confirmation date, delivery date)*/
    private String productInventoryAssignmentRequestDate;

    public void setProductInventoryAssignmentRequestType(String productInventoryAssignmentRequestType) {
        this.productInventoryAssignmentRequestType = productInventoryAssignmentRequestType;
    }

    public String getProductInventoryAssignmentRequestType() {
        return productInventoryAssignmentRequestType;
    }

    public void setProductInventoryAssignmentRequestDate(String productInventoryAssignmentRequestDate) {
        this.productInventoryAssignmentRequestDate = productInventoryAssignmentRequestDate;
    }

    public String getProductInventoryAssignmentRequestDate() {
        return productInventoryAssignmentRequestDate;
    }
}