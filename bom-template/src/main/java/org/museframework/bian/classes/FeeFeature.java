/*A charge for services rendered. 
*/
package org.museframework.bian.classes;

public class FeeFeature {
    /*A classification of fee according to the type of service. 
Type of service for which a charge is asked or paid. (ISO20022)*/
    private String feeType;

    /**/
    private String feeName;

    /**/
    private String feeDefinition;

    /**/
    private String feeDateTime;

    /*A plan (formula or structure) used to derive the value of fee rate 
*/
    private String feePlan;

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeName(String feeName) {
        this.feeName = feeName;
    }

    public String getFeeName() {
        return feeName;
    }

    public void setFeeDefinition(String feeDefinition) {
        this.feeDefinition = feeDefinition;
    }

    public String getFeeDefinition() {
        return feeDefinition;
    }

    public void setFeeDateTime(String feeDateTime) {
        this.feeDateTime = feeDateTime;
    }

    public String getFeeDateTime() {
        return feeDateTime;
    }

    public void setFeePlan(String feePlan) {
        this.feePlan = feePlan;
    }

    public String getFeePlan() {
        return feePlan;
    }
}