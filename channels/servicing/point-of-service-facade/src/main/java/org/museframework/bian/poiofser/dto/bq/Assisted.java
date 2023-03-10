/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.poiofser.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Assisted {
    /*Reference to the employee or unit staffing the POS*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Reference to the contact record reference for the serviced customer*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerContactReference;

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setCustomerContactReference(org.museframework.bian.classes.Object customerContactReference) {
        this.customerContactReference = customerContactReference;
    }

    public org.museframework.bian.classes.Object getCustomerContactReference() {
        return customerContactReference;
    }
}