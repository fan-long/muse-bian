/**/
package org.museframework.bian.parlifman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Precedents {
    /*The type of party property tracked (e.g. residential status, marital status, military, in a disaster location, etc.)*/
    @MetaField
    private String precedentType;

    /*Reference to the tracked value*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerPrecedentReference;

    /*Current (and historical) value of the precedent*/
    @MetaField
    private String customerPrecedentValue;

    /*The date when the value was last checked/confirmed*/
    @MetaField
    private String customerPrecedentValueDate;

    public void setPrecedentType(String precedentType) {
        this.precedentType = precedentType;
    }

    public String getPrecedentType() {
        return precedentType;
    }

    public void setCustomerPrecedentReference(org.museframework.bian.classes.Object customerPrecedentReference) {
        this.customerPrecedentReference = customerPrecedentReference;
    }

    public org.museframework.bian.classes.Object getCustomerPrecedentReference() {
        return customerPrecedentReference;
    }

    public void setCustomerPrecedentValue(String customerPrecedentValue) {
        this.customerPrecedentValue = customerPrecedentValue;
    }

    public String getCustomerPrecedentValue() {
        return customerPrecedentValue;
    }

    public void setCustomerPrecedentValueDate(String customerPrecedentValueDate) {
        this.customerPrecedentValueDate = customerPrecedentValueDate;
    }

    public String getCustomerPrecedentValueDate() {
        return customerPrecedentValueDate;
    }
}