/*InterestModality to calculate the interest

*/
package org.museframework.bian.classes;

public class InterestCalculationArrangementModality {
    /*A method has to be used for calculating the interest*/
    private org.museframework.bian.enumerations.Interestcalculationmethodtypevalues interestCalculationMethod;

    /*The periodicity of the calculation of the interest. (ISO20022)
*/
    private String interestCalculationFrequency;

    /*The calculation date of the interest amount. (ISO20022)*/
    private String interestCalculationDate;

    /*A parameter used to calculate the interest
*/
    private String interestCalculationParameter;

    /*Specifies whether the interest calculation method is simple or compounding. (ISO20022)

Simple: Calculation method by which interest is calculated on the original principal only. Accumulated interest from prior periods is not used in calculations for the following periods. (ISO20022)

Compounding: Calculation method by which interest is calculated each period on the original principal and all interest accumulated during past periods. (ISO20022)*/
    private org.museframework.bian.enumerations.Interestcalculationmethodtypevalues interestCalculationMethodType;

    public void setInterestCalculationMethod(org.museframework.bian.enumerations.Interestcalculationmethodtypevalues interestCalculationMethod) {
        this.interestCalculationMethod = interestCalculationMethod;
    }

    public org.museframework.bian.enumerations.Interestcalculationmethodtypevalues getInterestCalculationMethod() {
        return interestCalculationMethod;
    }

    public void setInterestCalculationFrequency(String interestCalculationFrequency) {
        this.interestCalculationFrequency = interestCalculationFrequency;
    }

    public String getInterestCalculationFrequency() {
        return interestCalculationFrequency;
    }

    public void setInterestCalculationDate(String interestCalculationDate) {
        this.interestCalculationDate = interestCalculationDate;
    }

    public String getInterestCalculationDate() {
        return interestCalculationDate;
    }

    public void setInterestCalculationParameter(String interestCalculationParameter) {
        this.interestCalculationParameter = interestCalculationParameter;
    }

    public String getInterestCalculationParameter() {
        return interestCalculationParameter;
    }

    public void setInterestCalculationMethodType(org.museframework.bian.enumerations.Interestcalculationmethodtypevalues interestCalculationMethodType) {
        this.interestCalculationMethodType = interestCalculationMethodType;
    }

    public org.museframework.bian.enumerations.Interestcalculationmethodtypevalues getInterestCalculationMethodType() {
        return interestCalculationMethodType;
    }
}