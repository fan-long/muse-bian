/*Rating of the Customer or Customer Relationship for value, credit, risk and etc. */
package org.museframework.bian.classes;

public class CustomerRating {
    /*A Classification Hierarchy that distinguishes between Customer Ratings according to the aspect concerned with. 
Example values are: Customer Credit Risk, Customer Profitability, Customer Loyalty etc. */
    private org.museframework.bian.enumerations.Customerratingtypevalues customerRatingType;

    /**/
    private String customerRatingValue;

    /**/
    private String customerRatingDescription;

    /**/
    private String customerRatingValueDate;

    /**/
    private String customerRatingValidityPeriod;

    public void setCustomerRatingType(org.museframework.bian.enumerations.Customerratingtypevalues customerRatingType) {
        this.customerRatingType = customerRatingType;
    }

    public org.museframework.bian.enumerations.Customerratingtypevalues getCustomerRatingType() {
        return customerRatingType;
    }

    public void setCustomerRatingValue(String customerRatingValue) {
        this.customerRatingValue = customerRatingValue;
    }

    public String getCustomerRatingValue() {
        return customerRatingValue;
    }

    public void setCustomerRatingDescription(String customerRatingDescription) {
        this.customerRatingDescription = customerRatingDescription;
    }

    public String getCustomerRatingDescription() {
        return customerRatingDescription;
    }

    public void setCustomerRatingValueDate(String customerRatingValueDate) {
        this.customerRatingValueDate = customerRatingValueDate;
    }

    public String getCustomerRatingValueDate() {
        return customerRatingValueDate;
    }

    public void setCustomerRatingValidityPeriod(String customerRatingValidityPeriod) {
        this.customerRatingValidityPeriod = customerRatingValidityPeriod;
    }

    public String getCustomerRatingValidityPeriod() {
        return customerRatingValidityPeriod;
    }
}