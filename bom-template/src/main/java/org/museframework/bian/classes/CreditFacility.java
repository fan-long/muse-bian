/*A credit facility is a type of loan made in a business or corporate finance context. It allows the borrowing business to take out money over an extended period of time rather than reapplying for a loan each time it needs money. In effect, a credit facility lets a company take out an umbrella loan for generating capital over an extended period of time.
https://www.investopedia.com/terms/c/creditfacility.asp*/
package org.museframework.bian.classes;

public class CreditFacility {
    /*Types of credit facilities include revolving loan facilities, retail credit facilities (like credit cards), committed facilities, letters of credit, and most retail credit accounts.*/
    private String creditFacilityType;

    /*The associated credit facility account number in any suitable format*/
    private String creditFacilityNumber;

    /*The amount of the credit facility*/
    private String creditFacilityAmount;

    /*The rate type to be applied to the credit facility*/
    private String creditFacilityRateType;

    /*Key dates for the credit facility like Origination Date, Maturity Date and etc. */
    private String creditFacilityDataTime;

    public void setCreditFacilityType(String creditFacilityType) {
        this.creditFacilityType = creditFacilityType;
    }

    public String getCreditFacilityType() {
        return creditFacilityType;
    }

    public void setCreditFacilityNumber(String creditFacilityNumber) {
        this.creditFacilityNumber = creditFacilityNumber;
    }

    public String getCreditFacilityNumber() {
        return creditFacilityNumber;
    }

    public void setCreditFacilityAmount(String creditFacilityAmount) {
        this.creditFacilityAmount = creditFacilityAmount;
    }

    public String getCreditFacilityAmount() {
        return creditFacilityAmount;
    }

    public void setCreditFacilityRateType(String creditFacilityRateType) {
        this.creditFacilityRateType = creditFacilityRateType;
    }

    public String getCreditFacilityRateType() {
        return creditFacilityRateType;
    }

    public void setCreditFacilityDataTime(String creditFacilityDataTime) {
        this.creditFacilityDataTime = creditFacilityDataTime;
    }

    public String getCreditFacilityDataTime() {
        return creditFacilityDataTime;
    }
}