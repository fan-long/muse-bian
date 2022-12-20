/*A collection of information feeds/measures that can be used to track the status of one or more items/entitites

Examples: Composite position, Customer alert*/
package org.museframework.bian.cuscrerat.dto.bq;

public class Alerts {
    /*The product/service instance that generated the alert*/
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The individual source of the alert - if not automated by production*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*The type of alert (e.g. missed payment, limit breach)*/
    private String customerCreditAlertType;

    /*Details of the event behind the notification*/
    private String customerCreditAlertDescription;

    /*The date and time of the notification*/
    private String date;

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setCustomerCreditAlertType(String customerCreditAlertType) {
        this.customerCreditAlertType = customerCreditAlertType;
    }

    public String getCustomerCreditAlertType() {
        return customerCreditAlertType;
    }

    public void setCustomerCreditAlertDescription(String customerCreditAlertDescription) {
        this.customerCreditAlertDescription = customerCreditAlertDescription;
    }

    public String getCustomerCreditAlertDescription() {
        return customerCreditAlertDescription;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}