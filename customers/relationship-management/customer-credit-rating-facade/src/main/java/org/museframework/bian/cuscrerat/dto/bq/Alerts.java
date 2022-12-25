/*A collection of information feeds/measures that can be used to track the status of one or more items/entitites

Examples: Composite position, Customer alert*/
package org.museframework.bian.cuscrerat.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Alerts {
    /*The product/service instance that generated the alert*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The individual source of the alert - if not automated by production*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*The type of alert (e.g. missed payment, limit breach)*/
    @MetaField(0)
    private String customerCreditAlertType;

    /*Details of the event behind the notification*/
    @MetaField(0)
    private String customerCreditAlertDescription;

    /*The date and time of the notification*/
    @MetaField(0)
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