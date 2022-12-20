/*A course of action for doing Apply Order Allocation Rules Workstep in the context of executing the Apply Order Allocation Rules Workstep*/
package org.museframework.bian.orderallocation.dto.bq;

public class OrderAllocationOutcome {
    /**/
    private String orderAllocationWorkProduct;

    /**/
    private org.museframework.bian.classes.Procedure orderAllocationProcedure;

    public void setOrderAllocationWorkProduct(String orderAllocationWorkProduct) {
        this.orderAllocationWorkProduct = orderAllocationWorkProduct;
    }

    public String getOrderAllocationWorkProduct() {
        return orderAllocationWorkProduct;
    }

    public void setOrderAllocationProcedure(org.museframework.bian.classes.Procedure orderAllocationProcedure) {
        this.orderAllocationProcedure = orderAllocationProcedure;
    }

    public org.museframework.bian.classes.Procedure getOrderAllocationProcedure() {
        return orderAllocationProcedure;
    }
}